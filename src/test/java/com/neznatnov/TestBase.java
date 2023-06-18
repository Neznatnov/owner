package com.neznatnov;

import com.codeborne.selenide.Configuration;
import com.neznatnov.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {
    @BeforeAll
    static void beforeAll() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser().toString();
        Configuration.browserVersion = config.getBrowserVersion();

        String env = System.getProperty("env");

        if ("remote".equals(env)) {
            Configuration.remote = config.getRemoteUrl();
        }
    }
}
