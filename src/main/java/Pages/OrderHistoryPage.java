package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends BasePages{
    public OrderHistoryPage(WebDriver driver) {
        super(driver);
    }

    //public WebElement OrderHistoryTitle=driver.findElement(By.xpath("//div[@id='center_column']/h1"));
    @FindBy(xpath="//div[@id='center_column']/h1")
    public WebElement OrderHistoryTitle;

    //public WebElement OrderReferenceTable=driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]"));
    @FindBy(xpath="//table[@id='order-list']/tbody/tr[1]/td[1]")
    public WebElement OrderReferenceTable;












}
