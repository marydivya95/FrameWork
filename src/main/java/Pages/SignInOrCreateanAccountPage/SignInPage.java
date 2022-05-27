package Pages.SignInOrCreateanAccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    WebDriver driver;

    @FindBy(xpath="//button[@id='btn_register']")
    WebElement btnCreateAccount;

    public SignInPage(WebDriver d) {
        driver = d;
        PageFactory.initElements(d,this);
    }

    public void CreateAccount()
    {
        btnCreateAccount.click();
    }


}
