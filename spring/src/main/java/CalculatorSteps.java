import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class CalculatorSteps {

    @Steps
    UserSteps userSteps;

    @Given("I get calculator client")
    public void getCalculatorClientBean() {
        userSteps.setUp();
    }

    @When("I call wsdl operation name='add' with params x=(\\d+) y=(\\d+)")
    public void add(int x, int y) {
        userSteps.add(x,y);
    }

    @Then("I verify response from service endpoint for add operation Expected result (\\d+)")
    public void verifyAddResponse(int value) {
        userSteps.verifyAddResponse(value);
    }

    @When("I call wsdl operation name='subtract' with params x=(\\d+) y=(\\d+)")
    public void subtract(int x, int y) {
        userSteps.subtract(x,y);
    }

    @Then("I verify response from service for subtract operation Expected result (\\d+)")
    public void verifySubtractResponse(int value) {
        userSteps.verifySubtractResponse(value);
    }

    @When("I call wsdl operation name='multiply' with params x=(\\d+) y=(\\d+)")
    public void multiply(int x, int y) {
        userSteps.multiply(x,y);
    }

    @Then("I verify response from service for multiply operation Expected result (\\d+)")
    public void verifyMultiplyResponse(int value) {
        userSteps.verifyMultiplyResponse(value);
    }

    @When("I call wsdl operation name='division'  with params x=(\\d+) y=(\\d+)")
    public void divide(int x, int y) {
        userSteps.divide(x,y);
    }

    @Then("I verify response from service for division operation Expected result (\\d+)")
    public void verifyDivisionResponse(int value) {
        userSteps.verifyDivisionResponse(value);
    }



}
