package ru.stepchenkov.test.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.ElementPage;
import ru.stepchenkov.test.readProperties.ConfigurationProvider;

public class MainPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[1]")
    private WebElement elements;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public ElementPage getElementPage() {
        elements.click();
        return new ElementPage();
    }
}
