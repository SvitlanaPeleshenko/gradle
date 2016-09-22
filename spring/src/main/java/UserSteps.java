import com.soap.AddResponse;
import com.soap.DivideResponse;
import com.soap.MultiplyResponse;
import com.soap.SubtractResponse;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
//import org.testng.Assert;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.Math.*;

public class UserSteps extends ScenarioSteps {

    CalculatorClient client;
    AddResponse addResponse;
    SubtractResponse subtractResponse;
    MultiplyResponse multiplyResponse;
    DivideResponse divideResponse;

    @Step
    public void setUp() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        client = context.getBean(CalculatorClient.class);
       // Assert.assertTrue(true);
    }

    @Step
    public void add (int firstValue, int secondValue) {
         addResponse = client.getAddResponse(firstValue,secondValue);
    }

    @Step
    public void verifyAddResponse (int value) {
        MatcherAssert.assertThat("Test calculator's option 'Addition'.", addResponse.getResult(), Is.is((float)value));
    }

    @Step
    public void subtract (int x, int y) {
        subtractResponse = client.getSubtractResponse(x, y);
    }

    @Step
    public void verifySubtractResponse (int value) {
        MatcherAssert.assertThat("Test calculator's option 'Subtract'.", subtractResponse.getResult(), Is.is((float)value));
    }

    @Step
    public void multiply (int x, int y) {
        multiplyResponse = client.getMultiplyResponse(x,y);
    }

    @Step
    public void verifyMultiplyResponse (int value) {
        MatcherAssert.assertThat("Test calculator's option 'Multiply'.", multiplyResponse.getResult(), Is.is((float)value));
    }

    @Step
    public void divide (int x, int y){divideResponse = client.getDivideResponse(x,y);
}

    @Step
    public void verifyDivisionResponse (int value) {
        MatcherAssert.assertThat("Test calculator's option 'Division'.", value, Is.is(Math.round(divideResponse.getResult())));
    }

}
