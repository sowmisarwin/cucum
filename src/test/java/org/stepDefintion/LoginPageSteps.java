package org.stepDefintion;

import java.util.concurrent.TimeUnit;

import org.baseMethods.Base;
import org.openqa.selenium.By;
import org.pojoclass.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends Base{
	
	@Given("user has to launch chrome and hit FB url")
	public void user_has_to_launch_chrome_and_hit_FB_url() {
		launchUrl("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	
	@When("user enter username and password")
	public void user_enter_username_and_password() {
		LoginPojo l=new LoginPojo();
		fill(l.getUser(), "sowmi");
		fill(l.getPass(), "ss123");
	}

	@When("user click login button")
	public void user_click_login_button() {
		//LoginPojo l1=new LoginPojo();
		//btnClick(l1.getBtnClick());
		driver.findElement(By.name("login")).click();
	}

	@Then("user should be in invalid credentials page")
	public void user_should_be_in_invalid_credentials_page() {
		System.out.println("Unable to login");
	}


}
