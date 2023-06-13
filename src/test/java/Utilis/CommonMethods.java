package Utilis;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {

    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String URL, String browser){

        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
//       maximize thhe window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(URL);
//        implicit wait
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
    }
    public static void closeBrowser() {
        if(driver!=null) {
            driver.quit();
        }
    }
    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
    public static void selectDropdown(String text, WebElement webElement){
        Select select = new Select(webElement);
        select.selectByValue(text);
    }
    public static void screenShot(String path) throws IOException {
        TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
        File screenShotFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShotFile,new File(path));
    }
}
