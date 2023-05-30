package Class01.HomeWork;
/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name, or id as locators
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01ParaBank {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //Open browser, Navigate to designated URL, Maximize a browser window
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        //find the elements of form by ID and fill in the details
        driver.findElement(By.id("customer.firstName")).sendKeys("Mikle");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kane");
        driver.findElement(By.id("customer.address.street")).sendKeys("Castle Road");
        driver.findElement(By.id("customer.address.city")).sendKeys("George Washington");
        driver.findElement(By.id("customer.address.state")).sendKeys("DC");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("1700");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("001236589452");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");

        //find the elements of form by name and fill in the details
        driver.findElement(By.name("customer.username")).sendKeys("Mikle");
        driver.findElement(By.name("customer.password")).sendKeys("GoldenTube!@#123");
        driver.findElement(By.name("repeatedPassword")).sendKeys("GoldenTube!@#123");

        //Just to look at the form for a short while
        Thread.sleep(3000);

        //Close the browser (without registration)
        driver.quit();
    }
}
