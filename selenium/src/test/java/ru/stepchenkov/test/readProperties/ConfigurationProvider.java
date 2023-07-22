package ru.stepchenkov.test.readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigurationProvider {

    Config config = getConfig();

    private static Config getConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    String URL = config.getString("url");
    String login = config.getString("users.test.login");
    String password = config.getString("users.test.password");
}
