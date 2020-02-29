import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteFlagSteps {
    private WebDriver webDriver;
    private DeleteFlag deleteFlag;

    public void PutFlag(){
        System.setProperty("webdriver.chrome.driver", "D:/Java_automation/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();
        deleteFlag = new DeleteFlag(webDriver);
    }

    @Given("^I am on a main application page$")
    public void login(){
        webDriver.get("https://www.mail.ru/");
        webDriver.manage().window().maximize();
    }

    @When("^I login as correct user$")
    public void loginAsUser(){
        deleteFlag.enterLogin("mfedorova0604");
        deleteFlag.enterPassword("iloveLiverpool123");
    }

    @Then("^is flag on$")
    public void isFlagOn(){
        boolean actual = deleteFlag.isFlagOff();
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }
}
