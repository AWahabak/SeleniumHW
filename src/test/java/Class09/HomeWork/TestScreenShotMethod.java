package Class09.HomeWork;

import Utilis.CommonMethods;

import java.io.IOException;

public class TestScreenShotMethod extends CommonMethods {
    public static void main(String[] args) throws IOException {

        String url = "https://www.amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        String path = "C:\\Users\\HOME\\IdeaProjects\\SDETBatch16Basic\\screenShots\\AmazonScreenShort.png";
        screenShot(path);

        driver.quit();
    }
}
