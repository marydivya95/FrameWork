package Pages;

import BaseClass.BrowserAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;
    @FindBy(name = "q")
    WebElement TextBox;

    @FindBy(xpath = "//div[@class='QlyBfb']/button[contains(text(),'No thanks')]")
    WebElement Alert;

    @FindBy(xpath = "//a[contains(text(),'Gmail')]")
    WebElement GmailLink;

    public LoginPage (WebDriver d)
    {
       driver=d;
        PageFactory.initElements(d, this);
    }

    public void TextBox(String Search)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //TextBox.click();
       // TextBox.clear();
        TextBox.sendKeys(Search);
    }

    public void GmaiLinkClick()
    {
        GmailLink.click();
    }

}
