package TestsBDD;

import DataDriven.LoadProperties;
import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserCheckoutStepDef extends TestRunner{

    HomePage homeObject;
    SigninPage signinObj;
    RegisterationPage authObj;
    MyAccountPage accObj;
    CategoriesPage catObj;
    CheckoutPage checkoutObj;
    OrderHistoryPage historyObj;
    String fname= LoadProperties.userData.getProperty("Firstname");
    String lname= LoadProperties.userData.getProperty("Lastname");
    String email= LoadProperties.userData.getProperty("Email");
    String pw= LoadProperties.userData.getProperty("Password");
    String address= LoadProperties.userData.getProperty("Address");
    String city= LoadProperties.userData.getProperty("City");
    String state= LoadProperties.userData.getProperty("State");
    String zip= LoadProperties.userData.getProperty("ZipCode");
    String mobile= LoadProperties.userData.getProperty("MobileNumber");

    String ReferenceMsg;



    @Given("the user is registered to the website")
    public void the_user_is_registered_to_the_website() {

        homeObject=new HomePage(driver);
        homeObject.OpenSigninPage();

        signinObj=new SigninPage(driver);
        signinObj.OpenCreateAccount(email);

        authObj=new RegisterationPage(driver);
        authObj.CreateAccount(fname,lname,pw,address,city,state,zip,mobile);

        accObj= new MyAccountPage(driver);

        Assert.assertTrue(accObj.WelcomeMsg.getText().contains("Welcome"));

        accObj.Signout();
    }

    @Given("the user is logged in the website")
    public void the_user_is_logged_in_the_website() {
        homeObject=new HomePage(driver);
        homeObject.OpenSigninPage();

        signinObj=new SigninPage(driver);
        signinObj.Signin(email,pw);

        accObj= new MyAccountPage(driver);

        Assert.assertTrue(accObj.WelcomeMsg.getText().contains("Welcome"));

    }

    @When("the user adds a product to cart")
    public void the_user_adds_a_product_to_cart() {

        accObj.ClickBlousesCategory();

        catObj=new CategoriesPage(driver);

        Assert.assertTrue(catObj.BlousesTitle.getText().contains("BLOUSES"));

        catObj.AddToCartBlouse();

    }
    @When("the user checkouts")
    public void the_user_checkouts() {
        checkoutObj=new CheckoutPage(driver);

        Assert.assertTrue(checkoutObj.ShoppingCartTitle.getText().contains("SHOPPING-CART"));

        ReferenceMsg=checkoutObj.Checkout();

        Assert.assertTrue(checkoutObj.OrderCompletedTitle.getText().contains("Your order on My Store is complete."));

        checkoutObj.OpenOrderHistoryPage();


    }
    @Then("order shall be added to order history")
    public void order_shall_be_added_to_order_history() {

        historyObj=new OrderHistoryPage(driver);

        Assert.assertTrue(historyObj.OrderHistoryTitle.getText().contains("HISTORY"));

        Assert.assertTrue(historyObj.OrderReferenceTable.getText().contains(ReferenceMsg));



    }



}
