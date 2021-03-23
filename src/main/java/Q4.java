import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishali Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&b ack=my-account");
        driver.findElement(new By.ByName("email")).sendKeys("iiii@gmail.com");
        driver.findElement(new By.ById("passwd")).sendKeys("vaish");
        driver.findElement(new By.ById("SubmitLogin")).sendKeys(Keys.ENTER);

        driver.findElement(new By.ById("contact-link")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        new Select(driver.findElement(By.id("id_contact"))).selectByVisibleText("Customer service");
        new Select(driver.findElement(By.name("id_order"))).selectByVisibleText("ZZUSZDNLU - 03/22/2021");
        new Select(driver.findElement(By.id("300628_order_products"))).selectByVisibleText("Printed Dress - Color : Orange, Size : S");
        driver.findElement(By.id("message")).sendKeys("Successful");
        driver.findElement(new By.ByXPath("//*[@id=\"submitMessage\"]")).click();

    }
}


