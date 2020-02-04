package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrPositionsPage extends AbstractClass{
    WebDriver driver;

    public HrPositionsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }
    @FindBy(xpath="//span[text()='Positions']")
    private WebElement positions;
    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputpositionName;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement getInputPositionShortName;
    public void clickOnPositions(){
        clickFunction(positions);
    }
    public void typeInputpositionnName(String citizenName) {
        sendkeysFunction(inputpositionName, citizenName);
    }

    public void typeInputpositionShortName(String shortName) {
        sendkeysFunction(getInputPositionShortName,shortName);
    }

}
