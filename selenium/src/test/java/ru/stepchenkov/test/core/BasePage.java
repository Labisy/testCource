package ru.stepchenkov.test.core;

import org.openqa.selenium.WebDriver;

abstract public class BasePage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }
}
