package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePages{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    //public WebElement ShoppingCartTitle=driver.findElement(By.id("cart_title"));
    @FindBy(id="cart_title")
    public WebElement ShoppingCartTitle;


    //WebElement ProcessToCheckoutBtn1=driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a[1]/span"));
    @FindBy(xpath="//div[@id='center_column']/p[2]/a[1]/span")
     WebElement ProcessToCheckoutBtn1;

    //WebElement ProcessToCheckoutBtn2=driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span"));
    @FindBy(xpath="//div[@id='center_column']/form/p/button/span")
     WebElement ProcessToCheckoutBtn2;

    //WebElement ProcessToCheckoutBtn3=driver.findElement(By.xpath("//form[@id='form']/p/button/span"));
    @FindBy(xpath="//form[@id='form']/p/button/span")
    WebElement ProcessToCheckoutBtn3;


    //WebElement TermsCheckBox=driver.findElement(By.id("cgv"));
    @FindBy(id="cgv")
     WebElement TermsCheckBox;


    //WebElement BankWireOption=driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
    @FindBy(xpath="//a[@title='Pay by bank wire']")
    WebElement BankWireOption;


    //WebElement ConfirmBtn=driver.findElement(By.xpath("//p[@id='cart_navigation']/button[@type='submit']"));
    @FindBy(xpath="//p[@id='cart_navigation']/button[@type='submit']")
    WebElement ConfirmBtn;


    //public WebElement OrderCompletedTitle=driver.findElement(By.xpath("//p[@class='cheque-indent']/strong"));
    @FindBy(xpath="//p[@class='cheque-indent']/strong")
    public WebElement OrderCompletedTitle;


    //WebElement OrdersHistoryLink=driver.findElement(By.xpath("//a[@title='Back to orders']"));
    @FindBy(xpath="//a[@title='Back to orders']")
     WebElement OrdersHistoryLink;


    //WebElement OrderReferenceMsg=driver.findElement(By.xpath("//div[@class='box']"));
    @FindBy(xpath="//div[@class='box']")
    WebElement OrderReferenceMsg;


    public String Checkout()
    {


        //summary
        //WebElement ProcessToCheckoutBtn1=driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a[1]/span"));
        ProcessToCheckoutBtn1.click();

        //Address
        //WebElement ProcessToCheckoutBtn2=driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span"));
        ProcessToCheckoutBtn2.click();

        //Shipping
        //WebElement TermsCheckBox=driver.findElement(By.id("cgv"));
        TermsCheckBox.click();

        //WebElement ProcessToCheckoutBtn3=driver.findElement(By.xpath("//form[@id='form']/p/button/span"));
        ProcessToCheckoutBtn3.click();

        //Payment
        //WebElement BankWireOption=driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
        BankWireOption.click();

        //WebElement ConfirmBtn=driver.findElement(By.xpath("//p[@id='cart_navigation']/button[@type='submit']"));
        ConfirmBtn.click();


        //WebElement OrderReferenceMsg=driver.findElement(By.xpath("//div[@class='box']"));
        String RefernceMsg= OrderReferenceMsg.getText();
        String[] words = RefernceMsg.split(" ");
        System.out.println(words[36]);

        return words[36];



    }
    public void OpenOrderHistoryPage()
    {
        //WebElement OrdersHistoryLink=driver.findElement(By.xpath("//a[@title='Back to orders']"));
        OrdersHistoryLink.click();

    }


}
