package StepDefination;

import BaseClass.BrowserAction;
import Pages.HomePage.HomePage;
import Pages.SignInOrCreateanAccountPage.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import static BaseClass.BrowserAction.driver;

public class SD02_NavigateToCreateAcoountScreen {

    @Given("click on UserAccountIcon and navigate to Sign In or Create an Account screen")
    public void click_on_user_account_icon_and_navigate_to_sign_in_or_create_an_account_screen() {
        HomePage home=new HomePage(driver);
        home.UserAccountIcon();
    }

    @Then("Click on Create Account Button")
    public void click_on_create_account_button() {
        SignInPage signin=new SignInPage(driver);
        signin.CreateAccount();
    }

    @Then("Assert on Create an Account screen")
    public void assert_on_create_an_account_screen() {
       String Createaccount=driver.findElement((By.xpath(" //p[@class='content'][contains(text(),'Personal Details')]"))).getText();
        String ExpectedCondition="Personal Details";
        String ActualCondition= Createaccount;
        Assert.assertEquals(ExpectedCondition,ActualCondition);
    }
}
