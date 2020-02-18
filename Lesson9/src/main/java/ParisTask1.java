import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParisTask1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Java_automation/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.manage().window().maximize();
        WebElement searchCity = driver.findElement(By.xpath("//input[@name='ss']"));
        searchCity.sendKeys("Paris");
        Thread.sleep(2000);
        WebElement firstOption = driver.findElement(By.xpath("(.//li[@role='option'])[1]"));
        firstOption.click();
        Thread.sleep(2000);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime nowDate = LocalDateTime.now();
        LocalDateTime plusTreeDays = nowDate.plusDays(3);
        String newDate = plusTreeDays.format(dateTimeFormatter);
        System.out.println(newDate);
        String[] dateArray = newDate.split(" ");
        WebElement checkIn = driver.findElement(By.xpath(".//td[@data-date='" + dateArray[0]+ "']"));
        checkIn.click();
        DateTimeFormatter dateTimeFormatter10 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime nowDate10 = LocalDateTime.now();
        LocalDateTime plusTenDays = nowDate10.plusDays(10);
        String newDate10 = plusTenDays.format(dateTimeFormatter10);
        String[] dateArray10 = newDate10.split(" ");
        WebElement checkOut = driver.findElement(By.xpath(".//td[@data-date='" + dateArray10[0]+ "']"));
        checkOut.click();
        WebElement submitButton = driver.findElement(By.xpath(".//button[@data-sb-id='main']"));
        submitButton.click();
        WebElement budget = driver.findElement(By.xpath("(.//div[@class='bui-checkbox__label filter_item css-checkbox'])[1]"));
        budget.click();
        Thread.sleep(2000);
        WebElement hotelsFound = driver.findElement(By.xpath(".//div[@class='sr_header  sr_header--reduced']"));
        System.out.println(hotelsFound.getText());
        WebElement veryGood = driver.findElement(By.xpath("(.//div[@class='bui-checkbox__label filter_item css-checkbox '])[3]"));
        veryGood.click();
        Thread.sleep(4000);
        WebElement lowPrice = driver.findElement(By.xpath(".//a[@data-category='review_score_and_price']"));
        lowPrice.click();
        Thread.sleep(3000);
        WebElement price = driver.findElement(By.xpath("(.//div[@class='bui-price-display__value prco-inline-block-maker-helper'])[1]"));
        System.out.println(price.getText());
        Matcher matcher = Pattern.compile("[-]?[0-9]+(.[0-9]+)?").matcher(price.getText());
        matcher.find();
        String priceOnlyNumbers = matcher.group();
        System.out.println(priceOnlyNumbers);
        int neededPrice = 119;
        int daysWeStay = 7;
        int priceBookingHas = (Integer.parseInt(priceOnlyNumbers))/daysWeStay;
        System.out.println((priceBookingHas <= neededPrice) ? "YES, I WILL TAKE THIS ONE" : "NO, I NEED HOTEL WITH BETTER PRICE");
        driver.quit();
    }
}
