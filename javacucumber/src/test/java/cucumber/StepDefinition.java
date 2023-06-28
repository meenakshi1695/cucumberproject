package cucumber;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends TestBase {
	ValidateLogin vl;
	
	@Given("lanch the sauce browser")
	public void lanch_the_sauce_browser() {
	
		initialize();
		
	}

	@Given("user tries to give username and password")
	public void user_tries_to_give_username_and_password() {
		vl = new ValidateLogin();
		vl.loginValidation();
		vl.validUser_password();
	}

	@When("click on login button")
	public void click_on_login_button() {
		vl.SuccessValidate();
	}

	@Then("Navigate to home page")
	public void navigate_to_home_page() {
		vl.teardown();
	}
}
