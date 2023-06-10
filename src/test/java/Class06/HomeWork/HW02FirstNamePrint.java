package Class06.HomeWork;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*HW02:
goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
 */
public class HW02FirstNamePrint extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        WebElement userButton = driver.findElement(By.xpath("//button[@type='button']"));
        userButton.click();

        WebElement userName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(userName.getText());

        driver.quit();

    }
}
