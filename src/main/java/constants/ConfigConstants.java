package constants;

import utils.ConfigurationReader;

public class ConfigConstants {
    public static final String USERNAME = ConfigurationReader.getProperty("username");
    public static final String PASSWORD = ConfigurationReader.getProperty("password");
    public static final String PAGE_TITLE = ConfigurationReader.getProperty("pageTitle");
    public static final String URL = ConfigurationReader.getProperty("url");
}
