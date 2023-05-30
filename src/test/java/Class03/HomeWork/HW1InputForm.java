package Class03.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* use css and xpath to do this
HW1:
Open Chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form
 */
public class HW1InputForm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();

        //xpath
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Wick");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("JohnWick34@gmail.com");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123-455-6789");

        //cssSelector and xpath
        driver.findElement(By.cssSelector("input[placeholder='Address']")).sendKeys("32, My Street, 12401");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Kingston");

        //mix
        WebElement state = driver.findElement(By.cssSelector("select[name=state]"));
        Select select = new Select(state);
        select.selectByVisibleText("New York");

        driver.findElement(By.xpath("//input[contains(@name,'zip')]")).sendKeys("12401");
        driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.google.com");
        driver.findElement(By.cssSelector("input[value='yes']")).click();
        driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Sample filled");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Send ']")).click();

        Thread.sleep(1000);
        driver.close();


    }
}
