package Class02.HomeWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW (only use XPATH)
navigate to fb.com.
- click on create new account
- fill up all the textboxes
- close the popup
- close the browser
Note: in order for your code to work, you have to put
Thread.sleep(2000) after clicking on Create new account
The reason will be discussed in the next lecture
*/
public class HW01XPath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //Delay in order to close the popup of cookies manually
        Thread.sleep(10000);

        //Open form for a new account
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        //Delay as instructed, due to appearing of form related code
        Thread.sleep(3000);

        //Fills in the details
        driver.findElement(By.xpath("//*[@id=\"u_3_b_MN\"]")).sendKeys("Bob");
        driver.findElement(By.xpath("//*[@id=\"u_3_d_sR\"]")).sendKeys("Logan");
        driver.findElement(By.xpath("//*[@id=\"u_3_g_un\"]")).sendKeys("boblogan@testmail.com");
        driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("GoldenTube123!@#");
        driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("11");
        driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Dec");
        driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1982");
        driver.findElement(By.xpath("//*[@id=\"u_3_5_Ih\"]" )).click();

        //Quick Glance
        Thread.sleep(3000);

        //Close popup
        driver.findElement(By.xpath("//*[@id=\"u_3_9_pP\"]")).click();

        //Close browser
        driver.quit();
    }
}
