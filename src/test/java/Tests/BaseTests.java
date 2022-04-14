package Tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTests {

    public static WebDriver driver;
    Dimension dimension = new Dimension(1024, 768);

    @BeforeSuite
    public void StartDriver()
    {

        String Chromepath=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", Chromepath);
        driver= new ChromeDriver();
        driver.manage().window().setSize(dimension);
        driver.navigate().to("http://automationpractice.com/index.php");

    }



    @AfterSuite
    public void EndDriver()
    {
        driver.quit();
    }
}
