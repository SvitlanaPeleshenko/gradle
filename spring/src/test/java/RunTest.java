
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:build/reports","pretty:build/cucumber-report.json"})
public class RunTest {}

/*@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="D:\\SOAP_BDD2\\spring\\src\\test\\resources\\features\\add.feature")
public class RunTest {}*/
