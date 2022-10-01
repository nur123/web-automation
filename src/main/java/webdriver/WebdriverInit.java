package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class WebdriverInit {

    public static WebDriver driver;

    public static void initialize() {

        WebDriverManager.chromedriver().setup();
        // buka browser - inisialisasi si Webdriver
        driver = new ChromeDriver();
        //setting timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();

    }

    public static  void initializeWithSelenoid() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "100.0");
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            /* How to add test badge */
            put("name", "Test badge...");

            /* How to set session timeout */
            put("sessionTimeout", "15m");

            /* How to set timezone */
            put("env", new ArrayList<String>() {{
                add("TZ=WIB");
            }});

            /* How to enable video recording */
            put("enableVideo", true);
            put("enableVNC", true);
        }});
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void quit() {
        driver.quit();
    }
}