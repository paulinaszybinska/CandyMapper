import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class OpenMainPageTest {

    @Test
    public void openMainPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://candymapper.com/");
        driver.manage().window().maximize();

        By popupCloseButtonId = By.id("popup-widget238491-close-icon");
        WebElement popupCloseButton = driver.findElement(popupCloseButtonId);
        popupCloseButton.click();
    }

}
