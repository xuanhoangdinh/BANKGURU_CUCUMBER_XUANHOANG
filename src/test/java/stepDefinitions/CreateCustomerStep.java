package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.actions.CreateCustomerPage;
import com.bankguru.actions.HomePage;
import com.bankguru.actions.LoginPage;
import com.bankguru.actions.RegisterPage;

import commons.CommonTestCase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCustomerStep extends CommonTestCase {

	WebDriver driver;
	String username, password;
	HomePage homePage;
	RegisterPage registerPage;
	LoginPage loginPage;
	CreateCustomerPage createCustomerPage;
	static String customerId;

	public CreateCustomerStep() {
		driver = CommonTestCase.driver;
		createCustomerPage = PageFactory.initElements(driver, CreateCustomerPage.class);
	}

	@When("^I input key tab to customer name$")
	public void i_input_key_tab_to_customer_name() {
		createCustomerPage.pressKeyTabCustomerName(Keys.TAB);
	}

	@When("^I input data \"([^\"]*)\" to customer name$")
	public void i_input_data_to_customer_name(String value) {
		createCustomerPage.inputNumberCustomerName(value);
	}

	@When("^I input key space to customer name$")
	public void i_input_key_space_to_customer_name() {
		createCustomerPage.pressKeySpaceAddress(Keys.SPACE);

	}

	@When("^I input key tab to address$")
	public void i_input_key_tab_to_address() {
		createCustomerPage.pressKeyTabAddress(Keys.TAB);
	}

	@When("^I input key space to address$")
	public void i_input_key_space_to_address() {
		createCustomerPage.pressKeySpaceAddress(Keys.SPACE);
	}

	@When("^I input key tab to city$")
	public void i_input_key_tab_to_city() {
		createCustomerPage.pressKeyTabCity(Keys.TAB);
	}

	@When("^I input data \"([^\"]*)\" to city$")
	public void i_input_data_to_city(String value) {
		createCustomerPage.inputCity(value);
	}

	@When("^I input key space to city$")
	public void i_input_key_space_to_city() {
		createCustomerPage.pressKeyTabCity(Keys.SPACE);
	}

	@When("^I input key tab to state$")
	public void i_input_key_tab_to_state() {
		createCustomerPage.pressKeyState(Keys.TAB);
	}

	@When("^I input data \"([^\"]*)\" to state$")
	public void i_input_data_to_state(String value) {
		createCustomerPage.inputNumberState(value);

	}

	@When("^I input key space to state$")
	public void i_input_key_space_to_state() {
		createCustomerPage.pressKeyState(Keys.SPACE);

	}

	@When("^I input data \"([^\"]*)\" to pin$")
	public void i_input_data_to_pin(String value) {
		createCustomerPage.inputNumberPin(value);

	}

	@When("^I input key tab to pin$")
	public void i_input_key_tab_to_pin() {
		createCustomerPage.pressKeyPin(Keys.TAB);

	}

	@When("^I input key space to pin$")
	public void i_input_key_space_to_pin() {
		createCustomerPage.pressKeyPin(Keys.SPACE);

	}

	@When("^I input key tab to phone$")
	public void i_input_key_tab_to_phone() {
		createCustomerPage.pressKeyMobileNumber(Keys.TAB);

	}

	@When("^I input key space to phone$")
	public void i_input_key_space_to_phone() {
		createCustomerPage.pressKeyMobileNumber(Keys.SPACE);

	}

	@When("^I input data \"([^\"]*)\" to phone$")
	public void i_input_data_to_phone(String value) {
		createCustomerPage.inputNumberMobileNumber(value);

	}

	@When("^I input key tab to email$")
	public void i_input_key_tab_to_email() {
		createCustomerPage.pressKeyEmail(Keys.TAB);

	}

	@When("^I input data \"([^\"]*)\" to email$")
	public void i_input_data_to_email(String value) {
		createCustomerPage.inputNumberEmail(value);

	}

	@When("^I input key space to email$")
	public void i_input_key_space_to_email() {
		createCustomerPage.pressKeyEmail(Keys.SPACE);

	}

	@When("^I input with data \"([^\"]*)\" to customer name$")
	public void i_input_with_data_to_customer_name(String value) {
		createCustomerPage.inputNumberCustomerName(value);

	}

	@When("^I input with data \"([^\"]*)\" to date of birth$")
	public void i_input_with_data_to_date_of_birth(String value) {
		createCustomerPage.inputDateOfBirth(value);

	}

	@When("^I input with data \"([^\"]*)\" to address$")
	public void i_input_with_data_to_address(String value) {
		createCustomerPage.inputAddress(value);

	}

	@When("^I input with data \"([^\"]*)\" to city$")
	public void i_input_with_data_to_city(String value) {
		createCustomerPage.inputCity(value);

	}

	@When("^I input with data \"([^\"]*)\" to state$")
	public void i_input_with_data_to_state(String value) {
		createCustomerPage.inputNumberState(value);

	}

	@When("^I input with data \"([^\"]*)\" to pin$")
	public void i_input_with_data_to_pin(String value) {
		createCustomerPage.inputNumberPin(value);

	}

	@When("^I input with data \"([^\"]*)\" to phone$")
	public void i_input_with_data_to_phone(String value) {
		createCustomerPage.inputNumberMobileNumber(value);

	}

	@When("^I input with data \"([^\"]*)\" to email$")
	public void i_input_with_data_to_email(String email) {
		createCustomerPage.inputNumberEmail(email+ randomEmail() + "@gmail.com");

	}

	@When("^I input with data \"([^\"]*)\" to password$")
	public void i_input_with_data_to_password(String value) {
		createCustomerPage.inputPassWord(value);

	}

	@When("^I click submit button$")
	public void i_click_submit_button() {
		createCustomerPage.clickSummit();
	}

	@Then("^I get text UserID \"([^\"]*)\"$")
	public void i_get_text_UserID(String value) {
		customerId = createCustomerPage.getTexCustomerId();

	}

}