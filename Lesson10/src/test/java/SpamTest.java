import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Letters;
import page.Login;
import page.Spam;

public class SpamTest {
    private static Spam spam;
    private static Login login;
    private static WebDriver driver;

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "D:/Java_automation/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://mail.ru");
        driver.manage().window().maximize();
        login = new Login(driver);
        spam = new Spam(driver);
    }

    @Test
    public void letterNotSpam(){
        login.login("mfedorova0604","iloveLiverpool123");
        String actual = spam.letterNotSpam();
        String expected = "В вашей почте\n" + "нет спама";
        Assert.assertEquals(actual,expected);
    }
}
