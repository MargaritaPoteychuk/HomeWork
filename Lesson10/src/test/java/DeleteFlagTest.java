import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.DeleteFlag;
import page.Flag;
import page.Login;

public class DeleteFlagTest {
    private static DeleteFlag deleteFlag;
    private static Login login;
    private static WebDriver driver;

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "D:/Java_automation/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://mail.ru");
        driver.manage().window().maximize();
        login = new Login(driver);
        deleteFlag = new DeleteFlag(driver);
    }

    @Test
    public void letterNotSpam() {
        login.login("mfedorova0604", "iloveLiverpool123");
        boolean actual = deleteFlag.deleteFlag();
        boolean expected = false;
        Assert.assertEquals(actual, expected);
    }
}
