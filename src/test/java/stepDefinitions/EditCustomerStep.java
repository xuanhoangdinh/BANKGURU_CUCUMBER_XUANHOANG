package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.actions.CreateCustomerPage;
import com.bankguru.actions.EditCustomerPage;
import com.bankguru.actions.HomePage;
import com.bankguru.actions.LoginPage;
import com.bankguru.actions.RegisterPage;

import commons.CommonTestCase;
import cucumber.api.java.en.When;

public class EditCustomerStep extends CommonTestCase {

	WebDriver driver;
	String username, password;
	HomePage homePage;
	RegisterPage registerPage;
	LoginPage loginPage;
	CreateCustomerPage createCustomerPage;
	EditCustomerPage editCustomerPage;

	public EditCustomerStep() {
		driver = CommonTestCase.driver;
		editCustomerPage = PageFactory.initElements(driver, EditCustomerPage.class);
	}

	@When("^I input key tab to customer id$")
	public void i_input_key_tab_to_customer_id() {
		editCustomerPage.pressKeyTabCustomerId(Keys.TAB);

	}

	@When("^I input data \"([^\"]*)\" to customer id$")
	public void i_input_data_to_customer_id(String value) {
		editCustomerPage.inputCustomerId(value);

	}

	@When("^I input customer id$")
	public void i_input_customer_id() {
		editCustomerPage.inputCustomerId(CreateCustomerStep.customerId);
	}

	@When("^I click to submit button$")
	public void i_click_to_submit_button() {
		editCustomerPage.clickSummit();

	}

	@When("^I update key tab to address$")
	public void i_update_key_tab_to_address() {
		editCustomerPage.clearAddress();
		editCustomerPage.pressKeyTabAddress(Keys.TAB);

	}

	@When("^I update key tab to city$")
	public void i_update_key_tab_to_city() {
		editCustomerPage.clearCity();
		editCustomerPage.pressKeyTabCity(Keys.TAB);
	}

	@When("^I update data \"([^\"]*)\" to city$")
	public void i_update_data_to_city(String value) {
		editCustomerPage.clearCity();
		editCustomerPage.inputNumberCity(value);
	}

	@When("^I update key tab to state$")
	public void i_update_key_tab_to_state() {
		editCustomerPage.clearState();
		editCustomerPage.pressKeyState(Keys.TAB);
	}

	@When("^I update data \"([^\"]*)\" to state$")
	public void i_update_data_to_state(String value) {
		editCustomerPage.clearState();
		editCustomerPage.inputState(value);
	}

	@When("^I update data \"([^\"]*)\" to pin$")
	public void i_update_data_to_pin(String value) {
		editCustomerPage.clearPin();
		editCustomerPage.inputNumberPin(value);
	}

	@When("^I update key tab to pin$")
	public void i_update_key_tab_to_pin() {
		editCustomerPage.clearPin();
		editCustomerPage.pressKeyPin(Keys.TAB);

	}

	@When("^I update key tab to phone$")
	public void i_update_key_tab_to_phone() {
		editCustomerPage.clearMobileNumber();
		editCustomerPage.pressKeyMobileNumber(Keys.TAB);

	}

	@When("^I update data \"([^\"]*)\" to phone$")
	public void i_update_data_to_phone(String value) {
		editCustomerPage.clearMobileNumber();
		editCustomerPage.inputNumberMobileNumber(value);
	}

	@When("^I update key tab to email$")
	public void i_update_key_tab_to_email() {
		editCustomerPage.clearEmail();
		editCustomerPage.pressKeyEmail(Keys.TAB);
	}

	@When("^I update data \"([^\"]*)\" to email$")
	public void i_update_data_to_email(String value) {
		editCustomerPage.clearEmail();
		editCustomerPage.inputEmail(value);
	}

	@When("^I update key space to email$")
	public void i_update_key_space_to_email() {
		editCustomerPage.clearEmail();
		editCustomerPage.pressKeyEmail(Keys.SPACE);
	}

}