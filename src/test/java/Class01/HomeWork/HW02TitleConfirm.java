package Class01.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
enter the username "Tester"
enter the password "test"
get the title of the webPage and confirm that it is "Web Orders Login"
------------------__------__*** happy coding ***
 */
public class HW02TitleConfirm {
    public static void main(String[] args) throws InterruptedException {
        //Create driver
        WebDriver driver = new ChromeDriver();

        //Navigate
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        //Find elements and fill
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        //Click on login, but as it is not part of requirements, so clicking is ignored for now
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        //A short delay
        Thread.sleep(2500);

        //Confirm whether the webpage title is "Web Orders Login" or not
        if(driver.getTitle().equals("Web Orders Login")){
            System.out.println("***** WebPage Title is confirmed *****");
            System.out.println("*** Happy Coding ***");
        } else {
            System.out.println("***** WebPage Title is not confirmed *****");
            System.out.println("**** Please change the title");
            System.out.println("*** Coding is sad ***");
        }

        //Manual check of webpage title.
//        String pageTitle;
//        pageTitle = driver.getTitle();
//        System.out.println(pageTitle);

        //close of browser
        driver.quit();
    }
}
