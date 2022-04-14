package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePages {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //WebElement SigninBtn=driver.findElement(By.xpath("//div[@class='header_user_info']/a"));
    @FindBy(xpath="//div[@class='header_user_info']/a")
    WebElement SigninBtn;



    public void OpenSigninPage()
    {
        SigninBtn.click();
    }




}
