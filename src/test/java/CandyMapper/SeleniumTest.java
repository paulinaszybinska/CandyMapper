package CandyMapper.com;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void openCandyMapperPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://candymapper.com/");
        driver.manage().window().maximize();
    }
}
