package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CommonMethods {
        public static WebDriver driver;
        public static void openBrowserAndLaunchApplication(String URL, String browser) {
                ConfigReader.readProperties(Constants.CONFIG_READER_PATH);
                switch (ConfigReader.getPropertyValue("browser")) {
                        case "chrome":
                                driver = new ChromeDriver();
                                break;

                        case "firefox":
                                driver = new FirefoxDriver();
                                break;
                }
                driver.manage().window().maximize();
                driver.get(ConfigReader.getPropertyValue("url"));
                //implicit wait
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }

        public static void closeBrowser() {
                if (driver != null) {
                        driver.quit();
                }
        }
}
