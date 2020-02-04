package StepDefinitions;

import PageObjectModel.AbstractClass;
import PageObjectModel.HrPositionsPage;
import cucumber.api.java.en.Given;

public class PositionsSteps extends AbstractClass {
    HrPositionsPage hrp=new HrPositionsPage();

    @Given("^Click on positions$")
    public void click_on_positions() throws Throwable {
       hrp.clickOnPositions();
    }

    @Given("^Type in new positions names \"([^\"]*)\"$")
    public void type_in_new_postions_names(String arg1) throws Throwable {
        hrp.typeInputpositionnName(arg1);

    }
    @Given("^Type in shortnames\"([^\"]*)\"$")
    public void type_in_shortnames(String arg1) throws Throwable {
        hrp.typeInputpositionShortName(arg1);

    }

}
