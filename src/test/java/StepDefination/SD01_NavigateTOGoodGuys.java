package StepDefination;

import BaseClass.BrowserAction;
import PropertiesFile.ReadPropertiesFile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;



public class SD01_NavigateTOGoodGuys {
    @Given("Open Browser")
    public void open_browser() {
        BrowserAction Browser=new BrowserAction();
        Browser.OpenBrowserType("chrome");
    }
    @Given("Enter url and press <Enter> to Navigate to Home page of GGWebsite")
    public void enter_url_and_press_enter_to_navigate_to_home_page_of_gg_website() throws IOException {
        BrowserAction Browser=new BrowserAction();
        //Browser.getUrl("https://www.thegoodguys.com.au");
        Browser.getUrl(ReadPropertiesFile.PropFile("HNWebsite"));
    }
    @Then("Assert on GG HomePage")
    public void assert_on_gg_home_page() {

        String GoodguysTitle=BrowserAction.driver.getTitle();
        String ExpectedCondition="The Good Guys - Online Electrical & Home Appliances";
        String ActualCondition= GoodguysTitle;
        Assert.assertEquals(ExpectedCondition,ActualCondition);


    }

}
