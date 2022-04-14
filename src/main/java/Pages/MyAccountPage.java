package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePages{
    public MyAccountPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }



    //public WebElement WelcomeMsg=driver.findElement(By.className("info-account"));
    @FindBy(className="info-account")
    public WebElement WelcomeMsg;

    //WebElement WomenHover= driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]"));
    @FindBy(xpath="//div[@id='block_top_menu']/ul/li[1]")
    private WebElement WomenHover;

    //WebElement BlousesLink=driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[2]/a"));
    @FindBy(xpath="//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[2]/a")
    private WebElement BlousesLink;

    //WebElement BlousesLink=driver.findElement(By.xpath("//a[@class='logout']"));
    @FindBy(xpath="//a[@class='logout']")
    private WebElement SignoutBtn;

    public void ClickBlousesCategory()
    {
        actions.moveToElement(WomenHover).perform();
        BlousesLink.click();
    }

    public void Signout()
    {
        SignoutBtn.click();
    }

}
