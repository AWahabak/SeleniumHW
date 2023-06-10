package Class06.HomeWork;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*HW03:
develop a function in common methods
to select from dropdown(single select)
 */
public class HW03DropBoxSelect extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        String selection = "Saturday";
        WebElement webElement = driver.findElement(By.xpath("//select[@class='form-control']"));
        selectDropdown(selection, webElement);

        Thread.sleep(3000);
        driver.quit();

    }
}
