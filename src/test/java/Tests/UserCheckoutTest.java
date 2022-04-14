package Tests;

import DataDriven.LoadProperties;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserCheckoutTest extends BaseTests{

    HomePage homeObject;
    SigninPage signinObj;
    MyAccountPage accObj;
    CategoriesPage catObj;
    CheckoutPage checkoutObj;
    OrderHistoryPage historyObj;


    String email= LoadProperties.userData.getProperty("Email");
    String pw= LoadProperties.userData.getProperty("Password");



    @Test
    public void UserCanCheckoutSuccessfully()
    {
        homeObject=new HomePage(driver);
        homeObject.OpenSigninPage();

        signinObj=new SigninPage(driver);
        signinObj.Signin(email,pw);

        accObj= new MyAccountPage(driver);

        Assert.assertTrue(accObj.WelcomeMsg.getText().contains("Welcome"));

        accObj.ClickBlousesCategory();

        catObj=new CategoriesPage(driver);

        Assert.assertTrue(catObj.BlousesTitle.getText().contains("BLOUSES"));

        catObj.AddToCartBlouse();

        checkoutObj=new CheckoutPage(driver);

        Assert.assertTrue(checkoutObj.ShoppingCartTitle.getText().contains("SHOPPING-CART"));

        String ReferenceMsg=checkoutObj.Checkout();

        Assert.assertTrue(checkoutObj.OrderCompletedTitle.getText().contains("Your order on My Store is complete."));

        checkoutObj.OpenOrderHistoryPage();

        historyObj=new OrderHistoryPage(driver);

        Assert.assertTrue(historyObj.OrderHistoryTitle.getText().contains("HISTORY"));

        Assert.assertTrue(historyObj.OrderReferenceTable.getText().contains(ReferenceMsg));









    }





}
