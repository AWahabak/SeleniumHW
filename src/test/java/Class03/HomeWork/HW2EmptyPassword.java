package Class03.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* use css and xpath to do this
HW2:
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on a login button
Verify error message with text “Password cannot be empty” is displayed.
 */
public class HW2EmptyPassword {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[id='btnLogin']")).click();

        var promptMessage =driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        if(promptMessage.getText().equals("Password cannot be empty")){System.out.println("Anomaly msg is verified");}
        else{System.out.println("Anomaly msg is different");}

        driver.quit();



    }
}
