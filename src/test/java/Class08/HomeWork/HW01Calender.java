package Class08.HomeWork;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/* HW01:
goto syntax hrms
login, click on recruitment, select a date on the calendar
 */
public class HW01Calender extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement userPassword = driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        WebElement recruitmentTab = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentTab.click();

        WebElement calendar = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger'][1]"));
        calendar.click();

        WebElement monthPick = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selectMon = new Select(monthPick);
        selectMon.selectByValue("6");

        WebElement yearPick = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(yearPick);
        selectYear.selectByValue("2021");

        List<WebElement> dayPick = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day:dayPick){
            String dayCheck = day.getText();
            if(dayCheck.equals("21")){
                day.click();
                break;
            }
        }

        Thread.sleep(5000);
        driver.close();

    }
}
