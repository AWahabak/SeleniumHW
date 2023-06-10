package Class07.HomeWork;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/*HW01:
goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
login, click on PIM, from the table choose any ID, and print out the row number of that id
please make sure that your code is dynamic enough to cater if another row gets deleted,
it still prints the row correctly
 */
public class HW01IDRowNum extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement userPassword = driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        WebElement PIMbutton = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PIMbutton.click();

        List<WebElement> entireIDs=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i<entireIDs.size();i++){
            String idNum = entireIDs.get(i).getText();
            if(idNum.equals("54007A")){
                System.out.println("Row number of this ID is: "+(i+1));
            }
        }

        driver.quit();

    }
}
