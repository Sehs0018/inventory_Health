package PageDef;

import PageDef.PageStep.one_session_login_step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class One_session_login_def {
    one_session_login_step steps=new one_session_login_step();



    @Given("User lunch browser and direct to Inventory Health")

    public void lunch_browser()
    {
        steps.lunchbroswer();
    }


    @When("User enter valid credentials")

    public void login()
    {
        steps.login();
    }

    @Then("User session is saved")
    public void selecting_IDP()
    {
        steps.select_IDP();

    }
}
