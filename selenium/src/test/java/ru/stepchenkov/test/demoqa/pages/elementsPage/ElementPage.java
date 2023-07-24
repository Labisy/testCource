package ru.stepchenkov.test.demoqa.pages.elementsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.checkbox.CheckBox;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.textbox.TextBox;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.RadioButton;

public class ElementPage extends BasePage {

    @FindBy(id = "item-0")
    private WebElement textBoxBtn;
    @FindBy(id = "item-1")
    private WebElement checkBoxBtn;
    @FindBy(id = "item-2")
    private WebElement radioBtn;

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

    public RadioButton radioButton() {
        radioBtn.click();
        return new RadioButton();
    }
}
