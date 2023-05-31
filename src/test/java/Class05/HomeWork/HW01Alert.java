package Class05.HomeWork;

import Utilis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
HW01:
http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it
Note: don't worry if the text u send doesn't appear up in the text box
 */
public class HW01Alert extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement button = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        button.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.sendKeys("ishelabadish");
        alert1.accept();

        Thread.sleep(3000);

        driver.close();
    }
}
