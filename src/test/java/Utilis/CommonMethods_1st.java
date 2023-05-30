package Utilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods_1st {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url){
        // create instance
        WebDriver driver = new ChromeDriver();
        //noavigate to url
        driver.get(url);
        //maximize the windows
        driver.manage().window().maximize();
    }
    public static void closeBroser(){
        driver.quit(); //a static driver is required
    }
}
