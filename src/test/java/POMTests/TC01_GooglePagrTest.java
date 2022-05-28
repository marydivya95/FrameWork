//package POMTests;
//
//import BaseClass.BrowserAction;
//import Pages.LoginPage;
//import org.openqa.selenium.Alert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class TC01_GooglePagrTest {
//
//    @BeforeTest
//    public void startingBrowser()
//    {
//        BrowserAction Action=new BrowserAction();
//        Action.OpenBrowserType("chrome");
//        Action.getUrl("https://www.google.com/?hl=en-US&authuser=1");
//    }
//
//
//    @Test
//    public void Googlepage()
//    {
//        LoginPage log= new LoginPage(BrowserAction.driver);
//        log.TextBox("Divya");
//        log.GmaiLinkClick();
//
//
//    }
//    @AfterTest
//    public void Teardown()
//    {
//        BrowserAction Action=new BrowserAction();
//        Action.ClosingBrowser();
//    }
//
//
//}
