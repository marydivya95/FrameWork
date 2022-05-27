package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src\\Test\\java\\Features"},
        glue={"StepDefination"},
        plugin={"pretty:STDOUT","html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"},
        tags="@RegressionTest"


)






public class TestRunner {
}
