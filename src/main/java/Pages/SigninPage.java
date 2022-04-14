package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class SigninPage extends BasePages{
    public SigninPage(WebDriver driver) {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(60));
    }



    //WebElement EmailAddress=driver.findElement(By.xpath("//input[@id='email_create']"));
    @FindBy(xpath="//input[@id='email_create']")
    WebElement EmailAddress1;

    //WebElement CreateAccountBtn=driver.findElement(By.xpath("//button[@id='SubmitCreate']/span"));
    @FindBy(xpath="//button[@id='SubmitCreate']/span")
    WebElement CreateAccountBtn;

    //public WebElement AuthenticationErrorMsg=driver.findElement(By.xpath("//div[@id='create_account_error']/ol/li"));
    @FindBy(xpath ="//div[@id='create_account_error']/ol/li")
    public WebElement AuthenticationErrorMsg;


    //WebElement EmailAddress2=driver.findElement(By.xpath("//input[@id='email']"));
    @FindBy(xpath="//input[@id='email']")
    WebElement EmailAddress2;

    //WebElement Password=driver.findElement(By.xpath("//input[@id='passwd']"));
    @FindBy(xpath="//input[@id='passwd']")
    WebElement Password;

     //WebElement SigninBtn=driver.findElement(By.id("SubmitLogin"));
    @FindBy(id="SubmitLogin")
    WebElement SigninBtn;

    public void OpenCreateAccount(String email)

    {
        wait.until(ExpectedConditions.visibilityOf(EmailAddress1));
        EmailAddress1.sendKeys(email);
        CreateAccountBtn.click();
    }

    public void AuthenticateRegisteredAccount(String email)
    {
        EmailAddress1.sendKeys(email);
        CreateAccountBtn.click();
        wait.until(ExpectedConditions.visibilityOf(AuthenticationErrorMsg));

    }

    public void Signin(String email,String password)
    {
        EmailAddress2.sendKeys(email);
        Password.sendKeys(password);
        SigninBtn.click();
    }


}
