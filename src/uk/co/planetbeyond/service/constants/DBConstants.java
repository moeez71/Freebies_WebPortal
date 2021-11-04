package uk.co.planetbeyond.service.constants;

public class DBConstants
{
	public static final Integer USER_TYPE_ADMIN = 1;
	public static final Integer USER_TYPE_NORMAL = 2;
	public static final Integer USER_TYPE_FINANCE = 3;
	public static final Integer USER_TYPE_REPORTING_DASHBOARD=4;

	public static final Integer CONTRACT_STATUS_ACTIVE = 1;
	public static final Integer CONTRACT_STATUS_TERMINATED = 2;
	public static final Integer CONTRACT_STATUS_EXPIRED = 3;

	public static final Integer SHORTCODE_NETWORK_STATUS_INACTIVE = 0;
	public static final Integer SHORTCODE_NETWORK_STATUS_ACTIVE = 1;
	public static final Integer SHORTCODE_NETWORK_STATUS_TERMINATED = 2;
	public static final Integer SHORTCODE_NETWORK_STATUS_BLOCKED = 3;

	public static final String FILE_TYPE_AUTHORIZATION_LETTER_TEXT = "AUTHLTR";
	public static final String FILE_TYPE_ALLOCATION_LETTER_TEXT = "ALCLTR";
	public static final String FILE_TYPE_CONTRACT_TEXT = "CNTRCT";
	public static final String FILE_TYPE_CVAS_TEXT = "CVAS";
	public static final String FILE_TYPE_INVOICE_TEXT = "INVOICE";

	public static final Integer FILE_TYPE_ALLOCATION_LETTER = 1;
	public static final Integer FILE_TYPE_CONTRACT = 2;
	public static final Integer FILE_TYPE_CVAS = 3;
	public static final Integer FILE_TYPE_AUTHORIZATION_LETTER = 4;
	public static final Integer FILE_TYPE_INVOICE = 5;

	public static final Integer INVOICE_VENDOR_PAYMENT_STATUS_UNPAID = 1;
	public static final Integer INVOICE_VENDOR_PAYMENT_STATUS_PAID = 2;

	public static final Integer INVOICE_PB_PAYMENT_STATUS_UNPAID = 1;
	public static final Integer INVOICE_PB_PAYMENT_STATUS_PAID = 2;

	public static final Integer INVOICE_STATUS_IN_PROGRESS = 1;
	public static final Integer INVOICE_STATUS_COMPLETE = 2;

	public static final Integer TP_INVOICE_STATUS_MATCH_FOUND = 1;
	public static final Integer TP_INVOICE_STATUS_NO_MATCH_FOUND = 2;

}
