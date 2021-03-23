import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Q5{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php?controller=authentication&b ack=my-account");
        driver.findElement(new By.ByXPath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).sendKeys(Keys.ENTER);

        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,400)");

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(new By.ByXPath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));

        builder.moveToElement(element).perform();
        Thread.sleep(1000);
        driver.findElement(new By.ByXPath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]")).sendKeys(Keys.ENTER);
        driver.findElement(new By.ByXPath("//*[@id=\"add_to_cart\"]/button")).sendKeys(Keys.ENTER);
        driver.findElement(new By.ByXPath("//a[@title='Proceed to checkout']")).click();

        JavascriptExecutor j1 = (JavascriptExecutor)driver;
        j1.executeScript("window.scrollBy(0,600)");

        driver.findElement(new By.ByXPath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
        Assert.assertTrue(driver.getPageSource().contains("Already registered?"),"You can checkout without Sign-in");
    }
}
