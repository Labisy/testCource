package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.radioButton.entity.ListAndData;

import java.util.List;

public class RadioButton extends BasePage {

    @FindBy(id = "yesRadio")
    private WebElement yes;
    @FindBy(id = "impressiveRadio")
    private WebElement impressive;
    @FindBy(id = "noRadio")
    private WebElement noRadio;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span")
    private WebElement text;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")
    private WebElement yesLabel;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")
    private WebElement impressiveLabel;

    public RadioButton() {
        PageFactory.initElements(driver, this);
    }

    public ListAndData yesClick() {
        yesLabel.click();
        return getResultData();
    }

    public ListAndData impressive() {
        impressiveLabel.click();
        return getResultData();
    }

    public String noUseRadioButton() {
        return noRadio.getAttribute("disabled");
    }

    private ListAndData getResultData() {
        return new ListAndData(
                List.of(yes.isSelected(),
                        impressive.isSelected()),
                text.getText().toLowerCase()
        );
    }
}
