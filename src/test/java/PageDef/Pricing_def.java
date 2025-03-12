package PageDef;

import PageDef.PageStep.Pricing_step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Pricing_def {
    Pricing_step steps=new Pricing_step();


    @Given("User Select the idp")
    /*
     * This method for seller login to seller lab and then directs to Inventory Health
     */
    public void select_idp()
    {

     steps.selectidp();

    }

    @Given("User direct to Invetnory Health")
    public void Pricing_tab()
    {
        steps.pricing_tab();
    }

    @When("User Direct to pricing")

    public void Check_text()
    {
        steps.check_text();
    }

}
