import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Q2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS) ;
        driver.get("http://automationpractice.com/index.php?controller=authentication&b ack=my-account");
        driver.findElement(new By.ByName("email")).sendKeys("iiii@gmail.com");
        driver.findElement(new By.ById("passwd")).sendKeys("vaish");
        driver.findElement(new By.ById("SubmitLogin")).sendKeys(Keys.ENTER);

        driver.findElement(new By.ByXPath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).sendKeys(Keys.ENTER);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(new By.ByXPath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        builder.moveToElement(element).perform();
        Thread.sleep(3000);

        driver.findElement(new By.ByXPath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]")).sendKeys(Keys.ENTER);
        driver.findElement(new By.ByXPath("//*[@id=\"add_to_cart\"]/button")).sendKeys(Keys.ENTER);
        driver.findElement(new By.ByXPath("//a[@title='Proceed to checkout']")).click();

        JavascriptExecutor j = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(new By.ByXPath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
        driver.findElement(new By.ByXPath("//*[@id=\"center_column\"]/form/p/button")).click();
        driver.findElement(new By.ById("cgv")).click();
        driver.findElement(new By.ByXPath("//*[@id=\"form\"]/p/button")).click();
        driver.findElement(new By.ByXPath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p")).click();
        driver.findElement(new By.ByXPath("//*[@id=\"cart_navigation\"]/button")).click();

        JavascriptExecutor s = (JavascriptExecutor) driver;
        s.executeScript("window.scrollBy(0,200)");
    }
}
