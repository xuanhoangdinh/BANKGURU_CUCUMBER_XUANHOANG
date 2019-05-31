package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.ui.LoginPageUI;

import commons.CommonFunction;

public class LoginPage extends CommonFunction {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public RegisterPage clickHereLink() {
		waitVisible(LoginPageUI.HERE_LINK);
		click(LoginPageUI.HERE_LINK);
		return PageFactory.initElements(driver, RegisterPage.class);
	}

	public void inputUsename(String value) {
		waitVisible(LoginPageUI.USERNAME_LOGIN_TXT);
		input(LoginPageUI.USERNAME_LOGIN_TXT, value);

	}

	public void inputPassword(String value) {
		waitVisible(LoginPageUI.PASSWORD_LOGIN_TXT);
		input(LoginPageUI.PASSWORD_LOGIN_TXT, value);
	}

	public HomePage clickLogin() {
		waitVisible(LoginPageUI.LOGIN_BTN);
		click(LoginPageUI.LOGIN_BTN);
		return PageFactory.initElements(driver, HomePage.class);
	}
}