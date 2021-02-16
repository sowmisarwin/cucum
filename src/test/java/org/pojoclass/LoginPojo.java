package org.pojoclass;

import java.sql.Driver;

import org.baseMethods.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Base {
	public LoginPojo() {
		PageFactory.initElements(driver	, this);
	}
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(id="u_0_b")
	private WebElement btnClick;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	
	
}
