package Pages.HomePage;

import BaseClass.BrowserAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
  WebDriver driver;

  @FindBy(xpath = "//i[@class='nav-supplementary-icon ggdsicon-user-slim-o']")
    WebElement UserAccountIcon;

    public HomePage(WebDriver d)
    {
        driver=d;
        PageFactory.initElements(d, this);
    }

    public void UserAccountIcon()
    {
      UserAccountIcon.click();

    }


}
