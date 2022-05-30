package ru.gb.test.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.gb.test.base.BaseTest;
import ru.gb.test.pages.LoginPage;

public class LoginSteps extends BaseTest {
    private LoginPage loginPage;


    @Given("User is on Login page")
    public void user_is_on_Login_page(){
        loginPage = openApp()
                .clickLoginMenuButton();
    }

    @When("User click login button")
    public void user_click_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("User should see error message {string}")
    public void user_should_see_error_message(String string)  {
        loginPage.checkLoginErrorText(string);
    }

    @When("^User set login (\\w+)$")
    public void user_set_login(String string) {
        System.out.println("Set login: " + string);
    }

    @When("^User set password (\\w+)$")
    public void user_set_password(String string){
        System.out.println("Set password: " + string);

    }

    @Then("User is logged in")
    public void user_is_logged_in() {
        System.out.println("You done");
    }
}
