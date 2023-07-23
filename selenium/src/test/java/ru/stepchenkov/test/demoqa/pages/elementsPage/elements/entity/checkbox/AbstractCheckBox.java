package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.stepchenkov.test.core.BasePage;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.checkbox.util.SpecialService;

public abstract class AbstractCheckBox extends BasePage implements SpecialService {
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/button")
    private WebElement expandLiElements;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/div/button[1]")
    private WebElement expandAllBtn;
    public AbstractCheckBox() {
        PageFactory.initElements(driver, this);
        expandLiElements.click();
        expandAllBtn.click();
    }
}
