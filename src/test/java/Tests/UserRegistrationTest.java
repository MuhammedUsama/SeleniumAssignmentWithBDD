package Tests;

import DataDriven.LoadProperties;
import Pages.RegisterationPage;
import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.SigninPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest extends BaseTests{

    HomePage homeObject;
    SigninPage signinObj;
    RegisterationPage authObj;
    MyAccountPage accObj;

    String fname= LoadProperties.userData.getProperty("Firstname");
    String lname= LoadProperties.userData.getProperty("Lastname");
    String email= LoadProperties.userData.getProperty("Email");
    String pw= LoadProperties.userData.getProperty("Password");
    String address= LoadProperties.userData.getProperty("Address");
    String city= LoadProperties.userData.getProperty("City");
    String state= LoadProperties.userData.getProperty("State");
    String zip= LoadProperties.userData.getProperty("ZipCode");
    String mobile= LoadProperties.userData.getProperty("MobileNumber");


    @Test
    public void UserCanRegisterSuccessfully()
    {
        homeObject=new HomePage(driver);
        homeObject.OpenSigninPage();

        signinObj=new SigninPage(driver);
        signinObj.OpenCreateAccount(email);

        authObj=new RegisterationPage(driver);
        authObj.CreateAccount(fname,lname,pw,address,city,state,zip,mobile);

        accObj= new MyAccountPage(driver);

        Assert.assertTrue(accObj.WelcomeMsg.getText().contains("Welcome"));



    }


}
