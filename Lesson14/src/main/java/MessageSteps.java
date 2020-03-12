import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MessageSteps {
    private static final String MAIN_URL = "http://mail.ru";
    private static final String LOGIN = "mfedorova0604";
    private static final String PASSWORD = "iloveLiverpool123";
    private EyesRunner runner;
    private Message message;
    private WebDriver webDriver;
    private Eyes eyes;
    private String apiKey = "cRTpibZgq6NnqmJlm6GvfPMiN3GM9yZP8a101dCJiAz5I110";


    public MessageSteps() {
        System.setProperty("webdriver.chrome.driver", "D:/Java_automation/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();
        message = new Message(webDriver);
        runner = new ClassicRunner();
        eyes = new Eyes(runner);
        eyes.setApiKey(apiKey);
        eyes.setMatchLevel(MatchLevel.LAYOUT);
        eyes.open(webDriver, "App HW", "Test");
    }

    @Given("^I am in Inbox$")
    public void inbox() throws InterruptedException {
        webDriver.get(MAIN_URL);
        webDriver.manage().window().maximize();
        Thread.sleep(5000);
        message.enterLogin(LOGIN);
        Thread.sleep(1000);
        message.enterPassword(PASSWORD);
    }

    @When("^I take 1st screenshot$")
    public void take1stScreen() throws InterruptedException {
        Thread.sleep(5000);
        eyes.checkWindow("inbox");
    }


    @When("^I am in send window$")
    public void openSendWindow() throws InterruptedException {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        message.writeLetterWindow();
        eyes.checkWindow("message Window");
    }


    @When("^I filled in all the info$")
    public void filledWindow() throws InterruptedException {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        message.fillIn();
        eyes.checkWindow("filled message Window");
    }


    @When("^I press send$")
    public void send(){
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        message.sendMessage();
        eyes.checkWindow("sent Window");
    }

    @Then("^I compare 4 screenshots$")
    public void screenshot4(){
        eyes.closeAsync();
        eyes.abortIfNotClosed();
        webDriver.quit();
        TestResultsSummary allTestResults = runner.getAllTestResults();
        System.out.println(allTestResults);
        Assert.assertTrue(allTestResults.getAllResults()[0].getTestResults().isPassed());
    }
}


