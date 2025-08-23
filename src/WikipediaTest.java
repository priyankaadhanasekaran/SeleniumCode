import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.wikipedia.org/");

        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Artificial Intelligence");
        searchBox.submit();

        WebElement historySection = driver.findElement(By.linkText("History"));
        historySection.click();

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}
