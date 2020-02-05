package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class AbstractClass {


    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, 30);

    public void clickFunction(WebElement clickElement) {

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();

    }

    public void sendkeysFunction(WebElement sendkeysElement, String value) {

        wait.until(ExpectedConditions.visibilityOf(sendkeysElement));
        sendkeysElement.sendKeys(value);

    }


    public void waitUntilVisibility(WebElement waitElement) {
        try {
            wait.until(ExpectedConditions.visibilityOf(waitElement));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void waitUntilInVisibility(WebElement waitElement) {

        try {
            wait.until(ExpectedConditions.invisibilityOf(waitElement));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteFunctionality(List<WebElement> name, List<WebElement> deleteButton, String value, WebElement buttonYes) {

        for (int i = 0; i < name.size(); i++) {

            if (name.get(i).getText().equalsIgnoreCase(value)) {

                clickFunction(deleteButton.get(i));
                clickFunction(buttonYes);
            }
        }

    }

    public void verifyCreated(List<WebElement> tableList, String value) {

        boolean result = false;

        for (int i = 0; i < tableList.size(); i++) {

            if (tableList.get(i).getText().trim().equalsIgnoreCase(value)) {
                result = true;
                break;
            }
        }

        if (result == false) {
            Assert.fail();
        } else {
            System.out.println(value + " is displayed");
        }

    }

    public void verifyDeletedAbstractClass(List<WebElement> tableList, String value) throws InterruptedException {
        Thread.sleep(2000);
        boolean result = false;
        for (int i = 0; i < tableList.size(); i++) {
            if (tableList.get(i).getText().trim().equalsIgnoreCase(value)) {
                result = true;
                break;
            }
        }
        if (result == true) {
            Assert.fail();
        } else {
            System.out.println(value + " is not displayed");
        }
    }

}
