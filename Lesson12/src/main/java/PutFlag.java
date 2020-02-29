import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PutFlag {
    private WebDriver driver;

    @FindBy(id = "mailbox:login")
    private WebElement loginField;

    @FindBy(id = "mailbox:password")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
    private WebElement buttonEnter;

    @FindBy(xpath = "//*[@id='PH_logoutLink']")
    private WebElement logoutLink;

    @FindBy(xpath = "(//a[contains(@class,'letter')]//span[contains(@class,'checkbox__wrapper')])[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//a[contains(@class,'letter')]//span[contains(@class,'checkbox__wrapper')])[2]")
    public WebElement checkBox2;

    @FindBy(xpath = "(//a[contains(@class,'letter')]//span[contains(@class,'checkbox__wrapper')])[3]")
    public WebElement checkBox3;

    @FindBy(xpath = "(.//span[@class='button2__wrapper'])[8]")
    public WebElement threeDots;

    @FindBy(xpath = "(.//div[@class='list-item list-item_hover-support list-item_shortcut js-shortcut'])[2]")
    public WebElement flagOption;

    @FindBy(xpath = "(.//span[@class='ll-fs__icon'])[1]")
    public WebElement isFlagThere1;

    public PutFlag(WebDriver webdriver) {
        PageFactory.initElements(webdriver, this);
        this.driver = webdriver;
    }

    public void enterLogin(String login) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginField.clear();
        loginField.sendKeys(login);
        buttonEnter.click();
    }

    public void enterPassword(String password) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        passwordField.clear();
        passwordField.sendKeys(password);
        buttonEnter.click();
    }

    public boolean isFlag() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(checkBox1).build().perform();
        checkBox1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(checkBox2).build().perform();
        checkBox2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(checkBox3).build().perform();
        checkBox3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        threeDots.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        flagOption.click();
        return isFlagThere1.isDisplayed();
    }
}
