import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Message {
    private static final int LINK_PRESENSE_TIMEOUT = 10;

    private WebDriver driver;

    @FindBy(id = "mailbox:login")
    private WebElement loginField;

    @FindBy(id = "mailbox:password")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
    private WebElement buttonEnter;

    public void enterLogin(String login) {
        loginField.clear();
        loginField.sendKeys(login);
        buttonEnter.click();
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        buttonEnter.click();
    }

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

    @FindBy(xpath = "(.//div[@class = 'container--1HmQy'])[4]")
    public WebElement maxWindow;

    public Message(WebDriver webdriver) {
        PageFactory.initElements(webdriver, this);
        this.driver = webdriver;
    }

    public void writeLetterWindow() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        writeLetterButton.click();
        maxWindow.click();
        Thread.sleep(3000);
        maxWindow.click();
    }

    public void fillIn() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        toWhom.click();
        af.click();
        mf.click();
        addButton.click();
        maxWindow.click();
        Thread.sleep(3000);
        maxWindow.click();
    }

    public void sendMessage(){
        sendButton.click();
        sendEmpty.click();
    }

}

