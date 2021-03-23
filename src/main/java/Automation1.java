import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
public class Automation1{
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&b ack=my-account");
        driver.findElement(new By.ByName("email_create")).sendKeys("iiii@gmail.com");
        driver.findElement(new By.ByName("SubmitCreate")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(new By.ByName("customer_firstname")).sendKeys("Vaishali");
        driver.findElement(new By.ByName("customer_lastname")).sendKeys("Kaushik");
        driver.findElement(new By.ById("passwd")).sendKeys("vaish");
        driver.findElement(new By.ByName("company")).sendKeys("TTN");
        driver.findElement(new By.ByName("address1")).sendKeys("1234");
        driver.findElement(new By.ByName("city")).sendKeys("faridabad");
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Alaska");
        driver.findElement(new By.ByName("postcode")).sendKeys("00000");
        driver.findElement(new By.ByName("phone_mobile")).sendKeys("7865243190");
        driver.findElement(new By.ByName("alias")).sendKeys("112");
        Thread.sleep(1000);
        driver.findElement(new By.ByName("submitAccount")).sendKeys(Keys.ENTER);

        driver.findElement(new By.ByXPath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).sendKeys(Keys.ENTER);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }
}
