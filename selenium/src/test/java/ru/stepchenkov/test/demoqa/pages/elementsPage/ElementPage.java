package ru.stepchenkov.test.demoqa.pages.elementsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.CheckBox;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.TextBox;

public class ElementPage extends BasePage {

    @FindBy(id = "item-0")
    private WebElement textBoxBtn;
    @FindBy(id = "item-1")
    private WebElement checkBoxBtn;

    public ElementPage() {
        PageFactory.initElements(driver, this);
    }

    public TextBox textBox() {
        textBoxBtn.click();
        return new TextBox();
    }

    public CheckBox checkBox() {
        checkBoxBtn.click();
        return new CheckBox();
    }

}
