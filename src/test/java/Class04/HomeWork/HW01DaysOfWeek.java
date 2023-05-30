package Class04.HomeWork;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
HW1:
goto http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select Tuesday, Thursday, and Friday one by one
 */
public class HW01DaysOfWeek extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement daysOfWeek = driver.findElement(By.xpath("//select[@id='select-demo']"));
        daysOfWeek.click();

        Select select = new Select(daysOfWeek);
        select.selectByVisibleText("Tuesday");
        Thread.sleep(3000);

        select.selectByVisibleText("Thursday");
        Thread.sleep(3000);

        select.selectByVisibleText("Friday");
        Thread.sleep(3000);

        driver.quit();

    }
}
