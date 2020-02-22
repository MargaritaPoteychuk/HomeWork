package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Letters { //перемещение письма в спам
    @FindBy(xpath = "(//a[contains(@class,'letter')]//span[contains(@class,'checkbox__wrapper')])[1]")
    public WebElement checkBox;

    @FindBy(xpath = "(.//span[@class='button2__wrapper'])[5]")
    public WebElement toSpam;

    @FindBy(xpath = ".//a[@href='/spam/']")
    public WebElement spamButton;

    @FindBy(xpath = ".//span[@title=\"Margarita Fedorova <margaritapoteychuk@gmail.com>\"]")
    public WebElement letterTitle;



    public WebDriver driver;

    public Letters(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String letterToSpam() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        actions.moveToElement(checkBox).build().perform();
        checkBox.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        toSpam.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        spamButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return letterTitle.getText();
    }
}
