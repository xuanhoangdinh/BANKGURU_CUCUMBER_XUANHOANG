package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.actions.HomePage;
import com.bankguru.actions.LoginPage;
import com.bankguru.actions.RegisterPage;

import commons.CommonTestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegisterSteps extends CommonTestCase {

	WebDriver driver;
	String username, password;
	HomePage homePage;
	RegisterPage registerPage;
	LoginPage loginPage;

	public RegisterSteps() {
		driver = CommonTestCase.openBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^I navigate to Guru bank and click Here link$")
	public void i_navigate_to_Guru_bank_and_click_Here_link() throws Throwable {
		registerPage = loginPage.clickHereLink();

	}

	@When("^I input email \"([^\"]*)\"$")
	public void i_input_email(String value) throws Throwable {
		registerPage.inputEmailRegister(value + randomEmail() + "@gmail.com");
	}

	@When("^I click to submit account$")
	public void i_click_to_submit_account() throws Throwable {
		registerPage.clickSumit();
	}

	@When("^I get email and password$")
	public void i_get_email_and_password() throws Throwable {
		username = registerPage.getUsername();
		password = registerPage.getPassword();
	}

	@When("^I navigate to Log In page \"([^\"]*)\"$")
	public void i_navigate_to_Log_In_page(String url) throws Throwable {
		loginPage = registerPage.navigateToLoginPage(url);

	}

	@When("^I log in system$")
	public void i_log_in_system() throws Throwable {
		loginPage.inputUsename(username);
		loginPage.inputPassword(password);
		loginPage.clickLogin();
	}

}
