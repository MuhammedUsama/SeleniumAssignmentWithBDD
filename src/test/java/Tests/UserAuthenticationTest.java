package Tests;

import DataDriven.LoadProperties;
import Pages.HomePage;
import Pages.SigninPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserAuthenticationTest extends BaseTests{

    String email= LoadProperties.userData.getProperty("Email");
    HomePage homeObject;
    SigninPage signinObj;


    @Test
    public void UserAuthenticateRegisteredEmailSuccessfully()
    {
        homeObject = new HomePage(driver);
        homeObject.OpenSigninPage();

        signinObj = new SigninPage(driver);
        signinObj.AuthenticateRegisteredAccount(email);


        Assert.assertTrue(signinObj.AuthenticationErrorMsg.getText().contains("this email address has already been registered"));
    }

}
