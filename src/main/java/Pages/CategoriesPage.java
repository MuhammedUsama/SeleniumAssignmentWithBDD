package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoriesPage extends BasePages{

    public CategoriesPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
        wait= new WebDriverWait(driver, Duration.ofSeconds(60));
    }




    //public WebElement BlousesTitle=driver.findElement(By.className("cat-name"));
    @FindBy(className="cat-name")
    public WebElement BlousesTitle;

    //WebElement BlouseProduct=driver.findElement(By.xpath("//img[@title='Blouse']"));
    @FindBy(xpath="//img[@title='Blouse']")
    WebElement BlouseProduct;

    //WebElement AddToCartBtn=driver.findElement(By.xpath("//a[@title='Add to cart']"));
    @FindBy(xpath="//a[@title='Add to cart']")
    WebElement AddToCartBtn;

    //WebElement ProcessToCheckoutBtn=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
    @FindBy(xpath="//a[@title='Proceed to checkout']")
    WebElement ProcessToCheckoutBtn;

    public void AddToCartBlouse()
    {
        actions.moveToElement(BlouseProduct).perform();
        AddToCartBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable((ProcessToCheckoutBtn)));
        ProcessToCheckoutBtn.click();
    }

}
