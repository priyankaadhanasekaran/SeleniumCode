import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");

        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.navigate().refresh();

        driver.quit();
    }
}
