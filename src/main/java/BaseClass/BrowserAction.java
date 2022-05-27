package BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserAction {
    public static WebDriver driver;
    public void OpenBrowserType(String browserType) {

        if(browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
           else if(browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browserType.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();

        }

         else {

                driver = new ChromeDriver();

            }


        }

        public void getUrl(String url)
        {
            driver.get(url);
            driver.manage().window().maximize();
        }

        @After
        public void ClosingBrowser()
        {
            driver.close();
            driver.quit();
        }

    }


