package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

import java.util.List;

public class applicationPage extends AbstractClass {


    private WebDriver driver;


    public applicationPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement plusButton;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully created')]")
    private WebElement successfulMessage;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement buttonYes;

    @FindAll({
            @FindBy(xpath="//tbody//tr//td[2]")
    }  )
    private List<WebElement> tableListofNames;

    @FindAll({
            @FindBy(xpath="//ms-delete-button//button")
    })
    private List<WebElement> listOfDeleteButtons;

    public void clickPlusButton() {
        clickFunction(plusButton);
    }

    public void clickSaveButton() {
        clickFunction(saveButton);
    }

    public void clickYes() {
        clickFunction(buttonYes);
    }

    public void nameIsCreated(String value) throws InterruptedException {

        Thread.sleep( 2000 );
        System.out.println(tableListofNames.size()+"<-------------");
        verifyCreated( tableListofNames ,value );
    }

    public void deletingElement(String value){
        deleteFunctionality( tableListofNames ,listOfDeleteButtons ,value , buttonYes);
    }

    public void verifingDeleted(String value) throws InterruptedException {
        verifyDeletedAbstractClass( tableListofNames , value );
    }

}


