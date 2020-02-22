package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class GroupLetter {//-	отправка сообщения группе пользователей

    @FindBy(xpath = ".//span[@class='compose-button__txt']")
    public WebElement writeLetterButton;

    @FindBy(xpath = ".//button[@class=\"container--2lPGK type_base--rkphf color_secondary--2J-6y link--EcxEU inline--PKmCd\"]")
    public WebElement toWhom;

    @FindBy(xpath = "(.//div[@class='b-filelabel__item_title__text'])[1]")
    public WebElement af;

    @FindBy(xpath = "(.//div[@class='b-filelabel__item_title__text'])[2]")
    public WebElement mf;

    @FindBy(xpath = ".//span[@class='button2 button2_base button2_primary button2_hover-support']")
    public WebElement addButton;

    @FindBy(xpath = "(.//div[@class='container--1I_oa'])[1]")
    public WebElement typeText;

    @FindBy(xpath = ".//span[@class='button2 button2_base button2_primary button2_hover-support js-shortcut']")
    public WebElement sendButton;

    @FindBy(xpath = "(.//button[@data-test-id=\"false\"])[1]")
    public WebElement sendEmpty;

    @FindBy(xpath = ".//div[@class='layer__header']")
    public WebElement approveText;
    //.//div[@class='layer__header']
    //.//a[@class='layer__link']

    public WebDriver driver;

    public GroupLetter(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String  writeGroupLetter() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        writeLetterButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        toWhom.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        af.click();
        mf.click();
        addButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sendButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sendEmpty.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return approveText.getText();


    }

}
