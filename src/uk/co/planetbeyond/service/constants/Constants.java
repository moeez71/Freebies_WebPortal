package uk.co.planetbeyond.service.constants;

import uk.co.planetbeyond.util.CustomResourceBundle;
import uk.co.planetbeyond.util.StringUtil;

public class Constants extends CustomResourceBundle
{

	public Constants()
	{
		super("service");
	}

	private static Constants instance = null;

	public static synchronized Constants get()
	{
		if (instance == null || instance.reloadProperties())
		{
			instance = new Constants();
		}

		return instance;
	}

	public final String FILE_PATH = StringUtil.normalizePath(getString("FILE_PATH"));
	public final String TEMPORARY_PATH = StringUtil.normalizePath(getString("TEMPORARY_PATH"));

	public final Integer HIGHLIGHTS_MAX_FILE_SIZE_KILOBYTES = Integer.valueOf(getString("HIGHLIGHTS_MAX_FILE_SIZE_KILOBYTES"));

	public final String HIGHLIGHTS_FILE_EXTENSION = getString("HIGHLIGHTS_FILE_EXTENSION");
	public final String URL_FOR_REUSEABLE_CONTENT = getString("URL_FOR_REUSEABLE_CONTENT");

	public final String FTP_SERVER_ADDRESS = getString("FTP_SERVER_ADDRESS");

	public final String FTP_SERVER_USERNAME = getString("FTP_SERVER_USERNAME");

	public final Integer FTP_SERVER_PORT = Integer.parseInt(getString("FTP_SERVER_PORT"));

	public final String FTP_SERVER_PASSWORD = getString("FTP_SERVER_PASSWORD");

	public final Integer FTP_TIMEOUT_MILLISECONDS = Integer.parseInt(getString("FTP_TIMEOUT_MILLISECONDS"));

	public final String URL_FOR_CONTENT = getString("URL_FOR_CONTENT");

	public final String PATH_LINK = getString("PATH_LINK");

	// folder paths
	public final String CONTRACT_FOLDER_PATH = StringUtil.normalizePath(getString("CONTRACT_FOLDER_PATH"));

	public static final Integer CATEGORY_TYPE_DAILY = 1;
	public static final Integer CATEGORY_TYPE_FACEBOOK = 2;
	public static final Integer CATEGORY_TYPE_INSTAGRAM = 3;
	public static final Integer CATEGORY_TYPE_SOUNDCLOUD = 4;
	public static final Integer CATEGORY_TYPE_SNAPCHAT = 5;

	public static final String CATEGORY_TYPE_DAILY_STRING = "Daily";
	public static final String CATEGORY_TYPE_FACEBOOK_STRING = "Facebook";
	public static final String CATEGORY_TYPE_INSTAGRAM_STRING = "Instagram";
	public static final String CATEGORY_TYPE_SOUNDCLOUD_STRING = "SoundCloud";
	public static final String CATEGORY_TYPE_SNAPCHAT_STRING = "SnapChat";

}
