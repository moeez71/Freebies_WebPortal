package uk.co.planetbeyond.service.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.planetbeyond.util.StringUtil;

public class FTPUploader
{
	private final FTPClient ftp = new FTPClient();
	private static Logger log = LoggerFactory.getLogger(FTPUploader.class);

	private final String ftpServerAddress;
	private final int ftpTimeout;

	public FTPUploader(String ftpServerAddress, String username, String password, int ftpTimeout) throws SocketException, IOException
	{
		super();

		this.ftpServerAddress = ftpServerAddress;
		this.ftpTimeout = ftpTimeout;

		// connect to ftp server
		boolean connected = connectToFtpServer();

		if (!connected)
		{
			throw new IllegalStateException(String.format("Could not connect to ftp server | Server Address:%s | Username:%s | Password:%s", ftpServerAddress, username, password));
		}

		// login to the server
		if (!ftp.login(username, password))
		{
			throw new IllegalStateException(String.format("Invalid credentials | Server Address:%s | Username:%s | Password:%s", ftpServerAddress, username, password));
		}
	}

	/**
	 * Connects and logs in to ftp server, and uploads the file to ftp server
	 * 
	 * @param username
	 * @param password
	 * @param serverAdd
	 * @param filePathOnFtpServer
	 * @param localFilePath
	 * @throws IOException
	 */
	public void uploadFileToFtpServer(String filePathOnFtpServer, String localFilePath) throws IOException
	{
		FileInputStream in = null;

		try
		{
			in = new FileInputStream(localFilePath);
			uploadFileToFtpServer(filePathOnFtpServer, in);
		}
		finally
		{

			if (in != null)
			{
				in.close();
			}
		}
	}

	public void uploadFileToFtpServer(String filePathOnFtpServer, InputStream localFileInputStream) throws IOException
	{
		BufferedInputStream bis = new BufferedInputStream(localFileInputStream);

		ftp.enterLocalPassiveMode();
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		ftp.storeFile(filePathOnFtpServer, bis);

	}

	@Override
	public void finalize()
	{
		cleanUpResources();
	}

	public void cleanUpResources()
	{
		try
		{
			log.debug("Disconnecting ftp {}", ftp);
			if (ftp != null && ftp.isConnected())
			{
				ftp.disconnect();
			}
		}
		catch (Throwable e)
		{
			log.error(e.toString(), e);
		}
	}

	/**
	 * Connects to given ftp server, and returns true if connected. Or false otherwise
	 * 
	 * @param serverAdd
	 * @param ftpTimeout
	 * @return
	 * @throws SocketException
	 * @throws IOException
	 */
	public boolean connectToFtpServer() throws SocketException, IOException
	{
		if (ftp.isConnected())
		{
			throw new IllegalStateException("Requested to connect FTP Client when it is already connected.");
		}
		ftp.setConnectTimeout(ftpTimeout);
		ftp.connect(ftpServerAddress);
		ftp.setSoTimeout(ftpTimeout);

		int reply = ftp.getReplyCode();
		return FTPReply.isPositiveCompletion(reply);
	}

	/**
	 * Returns array of files/directories in given directory on ftp server
	 * 
	 * @param parentDir
	 *            if null, then directory listing of current directory is returned
	 * @return
	 * @throws IOException
	 */
	public FTPFile[] listDirectoryContents(String parentDir) throws IOException
	{
		if (parentDir != null)
		{
			parentDir = parentDir.trim();
		}

		if (!StringUtil.hasValue(parentDir))
		{
			// directory path is not given, so return the directory listing of current directory
			return ftp.mlistDir();
		}

		// Return the directory listing of given directory
		return ftp.mlistDir(parentDir);
	}

	public FTPClient getFtpClient()
	{
		return ftp;
	}
}