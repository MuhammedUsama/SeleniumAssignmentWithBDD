package TestsBDD;

;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(features = "src/test/java/TestsBDD/UserCheckout.feature",
        glue = {"TestsBDD"},
        tags = "@SuccessfullyCheckout"
)


public class TestRunner extends AbstractTestNGCucumberTests {
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
