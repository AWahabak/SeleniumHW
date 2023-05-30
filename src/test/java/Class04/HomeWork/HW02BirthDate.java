package Class04.HomeWork;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
HW2:
goto facebook.com
click on create account
and select your date of birth using select class
 */
public class HW02BirthDate extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        Thread.sleep(10000);  //this is added to close the cookies popup manually
//
//        WebElement cookies = driver.findElement(By.xpath("//[text()='Allow all cookies']"));
//        if (cookies.isDisplayed()) {
//            driver.findElement(By.xpath("//[text()='Allow all cookies']")).click();
//            Thread.sleep(1000);
//        }

        WebElement newAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
        newAccount.click();

        Thread.sleep(3000);

        WebElement dayOfDOB = driver.findElement(By.xpath("//select[@id='day']"));
        Select daySelect = new Select(dayOfDOB);
        daySelect.selectByVisibleText("4");

        WebElement monthOfDOB = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthSelect = new Select(monthOfDOB);
        monthSelect.selectByVisibleText("Mar");

        WebElement yearOfDOB = driver.findElement(By.xpath("//select[@id='year']"));
        Select yearSelect = new Select(yearOfDOB);
        yearSelect.selectByVisibleText("1981");

        Thread.sleep(3000);

        driver.quit();


    }
}
