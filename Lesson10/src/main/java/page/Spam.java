package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Spam { //письмо из спама

    @FindBy(xpath = "/html/body/div[6]/div/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div/div/a[1]/div[3]/button/div/span[1]/div/div/label/span")
    public WebElement checkBoxSpam;

    @FindBy(xpath = ".//a[@href='/spam/']")
    public WebElement spamButton;

    @FindBy(xpath = "(.//span[@class='button2__txt'])[5]")
    public WebElement notSpamButton;

    @FindBy(xpath = ".//div[@class='octopus__text']")
    public WebElement noSpamText;

    public WebDriver driver;

    public Spam(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String letterNotSpam() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        spamButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        actions.moveToElement(checkBoxSpam).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        checkBoxSpam.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        notSpamButton.click();
        return noSpamText.getText();
    }


}
