package ru.gb.test.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.gb.test.base.BaseTest;
import ru.gb.test.pages.FormsPage;

public class FormsSteps extends BaseTest {
    private FormsPage formsPage;

    @Given("User is on Forms page")
    public void user_is_on_Forms_page() {
        formsPage = openApp().
                clickFormsMenuButton();
    }

    @When("User clicks on the input field")
    public void user_clicks_on_the_input_field() {
        formsPage.clickInputField();
    }

    @When("User send keys to input field {string}")
    public void user_send_keys_to_input_field(String string) {
        formsPage.sendKeysToInputField(string);
    }

    @Then("User see {string} in the output field")
    public void user_see_in_the_output_field(String string) {
        formsPage.checkInputResultField(string);
    }
}
