package ru.stepchenkov.test.demoqa.pages.elementsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.TextBox;

public class ElementPage extends BasePage {

    @FindBy(id = "item-0")
    private WebElement menuTextBox;

    public ElementPage() {
        PageFactory.initElements(driver, this);
    }

    public TextBox getTextBox() {
        menuTextBox.click();
        return new TextBox();
    }

}
