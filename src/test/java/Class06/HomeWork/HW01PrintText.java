package Class06.HomeWork;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*HW01:
goto http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start
print the text "welcome syntax technologies" on console
 */
public class HW01PrintText extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement startButton= driver.findElement(By.xpath("//button[@id='startButton']"));
        startButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.visibilityOf(welcomeText));
        System.out.println(welcomeText.getText());

        driver.quit();
    }
}
