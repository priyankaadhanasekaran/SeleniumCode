import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeTest {
    public static void main(String[] args) {
        // Set path to chromedriver if not in PATH
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Navigate to Demoblaze
        driver.get("https://www.demoblaze.com/");

        // Verify page title
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("STORE")) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }

        // Close browser
        driver.quit();
    }
}
