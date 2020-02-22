package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Flag {
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

    public WebDriver driver;

    public Flag(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean putFlag() {
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
