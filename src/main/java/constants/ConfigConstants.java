package constants;

import utils.ConfigurationReader;

public class ConfigConstants {
    public static final String USERNAME = ConfigurationReader.getProperty("username");
    public static final String PASSWORD = ConfigurationReader.getProperty("password");
}
