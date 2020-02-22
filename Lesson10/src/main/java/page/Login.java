package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login {

    @FindBy(id="mailbox:login")
    private WebElement loginField;

    @FindBy(id="mailbox:password")
    private WebElement passwordField;

    @FindBy(xpath = "(.//input[@type='submit'])[1]")
    private WebElement button;

    public WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String login, String password){
        loginField.sendKeys(login);
        button.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        passwordField.sendKeys(password);
        button.click();
    }
}
