package ru.stepchenkov.test.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import ru.stepchenkov.test.readProperties.ConfigurationProvider;

import java.util.concurrent.TimeUnit;

abstract public class BaseTestSetup {

    private static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        /*
         * Ожидание загрузки страницы
         * Время ожидание загрузки элемента на странице
         */
        driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        BasePage.setDriver(driver);
    }

    @BeforeEach
    void openMainPage() {
        driver.get(ConfigurationProvider.URL);
    }

    @AfterAll
    static void shutdown() {
        driver.close();
        driver.quit();
    }
}
