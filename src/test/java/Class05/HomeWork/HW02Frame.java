package Class05.HomeWork;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
HW02:
goto https://chercher.tech/practice/frames
click on check box
then select the baby cat from drop down
then enter text in text box
 */
public class HW02Frame extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.switchTo().frame("frame1");
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame);

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(animals);
        select.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");

        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("ishlabadish");

        Thread.sleep(3000);

        driver.close();
    }
}
