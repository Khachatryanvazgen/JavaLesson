package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
import static constants.Constant.TimeoutVariable.IMPLICI_WAIT;

public class CommonActions {
  private static final String PLATFOEM_AND_BROWSER = "win_chrome";

    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (PLATFOEM_AND_BROWSER) {
            case  "win_chrome":
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            break;
            default:
                Assert.fail("inncorrect platform or browser " + PLATFOEM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICI_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
