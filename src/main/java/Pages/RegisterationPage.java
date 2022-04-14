package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class RegisterationPage extends BasePages{

    public RegisterationPage(WebDriver driver) {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(60));
    }





    //WebElement FName=driver.findElement(By.xpath("//input[@id='customer_firstname']"));
    @FindBy(xpath="//input[@id='customer_firstname']")
    WebElement FName;

    //WebElement LName=driver.findElement(By.xpath("//input[@id='customer_lastname']"));
    @FindBy(xpath="//input[@id='customer_lastname']")
    WebElement LName;

    //WebElement PW=driver.findElement(By.xpath("//input[@id='passwd']"));
    @FindBy(xpath="//input[@id='passwd']")
    WebElement PW;


    //WebElement Address=driver.findElement(By.xpath("//input[@id='address1']"));
    @FindBy(xpath="//input[@id='address1']")
    WebElement Address;


    //WebElement City=driver.findElement(By.xpath("//input[@id='city']"));
    @FindBy(xpath="//input[@id='city']")
    WebElement City;



    @FindBy(xpath="//select[@id='id_state']")
    WebElement StateDropDown;



    //WebElement ZipCode= driver.findElement(By.xpath("//input[@id='postcode']"));
    @FindBy(xpath="//input[@id='postcode']")
    WebElement ZipCode;



    //WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='phone_mobile']"));
    @FindBy(xpath="//input[@id='phone_mobile']")
    WebElement MobileNumber;


    //WebElement RegisterBtn=driver.findElement(By.xpath("//button[@id='submitAccount']/span"));
    @FindBy(xpath="//button[@id='submitAccount']/span")
    WebElement RegisterBtn;

    public void CreateAccount(String fname,String lname, String pw,
                              String address, String city, String state,
                              String zip,String mobile)
    {

        wait.until(ExpectedConditions.elementToBeClickable(FName));


        FName.sendKeys(fname);
        LName.sendKeys(lname);
        PW.sendKeys(pw);
        Address.sendKeys(address);
        City.sendKeys(city);
        select =new Select(StateDropDown);
        select.selectByVisibleText(state);
        ZipCode.sendKeys(zip);
        MobileNumber.sendKeys(mobile);


        RegisterBtn.click();

    }



}
