import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Booking {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Java_automation/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.manage().window().maximize();
        WebElement searchCity = driver.findElement(By.xpath("//input[@name='ss']"));
        searchCity.sendKeys("Москва");
        WebElement searchPersons = driver.findElement(By.xpath(".//label[@id='xp__guests__toggle']"));
        searchPersons.click();
        WebElement buttonMain = driver.findElement(By.xpath(".//button[@data-sb-id='main']"));
        buttonMain.click();
        Thread.sleep(3000);
        List<WebElement> hotel = driver.findElements(By.xpath(".//div[@class='sr-hotel__title-wrap']"));
        System.out.println(hotel.size());
        WebElement starRating5 = driver.findElement(By.xpath("//*[@id=\"filter_class\"]/div[2]/a[5]/label/div"));
        starRating5.click();
        Thread.sleep(3000);
        WebElement firstHotel = driver.findElement(By.xpath("(.//a[@class='hotel_name_link url'])[1]"));
        firstHotel.click();
        WebElement ratingOfTheFirstHotel = driver.findElement(By.xpath("(.//div[@class='bui-review-score__badge'])[1]"));
        double neededRating = 9.0;
        System.out.println("HOTEL RATING IS: " + ratingOfTheFirstHotel.getText());
        double ratingWeHave = Double.parseDouble(ratingOfTheFirstHotel.getText());
        System.out.println((ratingWeHave >= neededRating) ? "YES, I WILL TAKE THIS ONE" : "NO, I NEED HOTEL WITH BETTER RATING");
        driver.quit();


    }


}
