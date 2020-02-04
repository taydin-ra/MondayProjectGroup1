package PageObjectModel;

import Utilities.ReadPropertiesFile;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractClass {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            //  System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        return driver;
    }

    // find by is working as driver.findElement

    @FindBy(xpath="//input[@placeholder='Username']")
    private WebElement inputUserName;

    @FindBy(xpath="//input[@placeholder='Password']")
    private WebElement inputPassword;

    @FindBy(xpath="//button[@aria-label='LOGIN']")
    private WebElement buttonLogin;

    public void typeIninputUserName() {
        sendkeysFunction(inputUserName, ReadPropertiesFile.getData("Username"));


    }

    public void typeIninputPassword() {
        sendkeysFunction(inputPassword, ReadPropertiesFile.getData("Password"));

    }

    public void clickOnbuttonLogin() {
        clickFunction(buttonLogin);
    }
}



