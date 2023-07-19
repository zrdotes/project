package com.evotor.test.task.aleksandr.config;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

import static com.evotor.test.task.aleksandr.config.ConfigSingle.config;

public class WebDriverProvider  {

    public static Configuration createDriver() {
        Configuration configuration = new Configuration();
        switch (config.getBrowser()) {
            case FIREFOX: {
                WebDriverManager.chromedriver().setup();
                configuration.browser = "firefox";
                configuration.browserSize = "1920x1080";
                break;
            }
            default: {
                throw new RuntimeException("No such driver");
            }
        }
        return configuration;
    }
}
