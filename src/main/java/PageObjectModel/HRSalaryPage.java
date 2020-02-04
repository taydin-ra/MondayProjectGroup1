package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRSalaryPage extends AbstractClass {
    WebDriver driver;

    public HRSalaryPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath="//span[contains(text(),'Human Resources')]")

    private WebElement humanResource;

    @FindBy(xpath="(//span[contains(text(),'Setup')])[4]")

    private WebElement setup;

    @FindBy(xpath="//span[contains(text(),'Position Salary')]")

    private WebElement positionSalary;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement posiyionOfSalary;


    public void clickOnHumanResource(){
        clickFunction(humanResource);

    }

    public void clickOnSetup(){
        waitUntilVisibility(humanResource);
        clickFunction(setup);
    }

    public void clickOnPositionSalary(){
        clickFunction(positionSalary);

    }

    public void typeInPositionSalary(String salary){
        sendkeysFunction(positionSalary,salary);
    }


}
