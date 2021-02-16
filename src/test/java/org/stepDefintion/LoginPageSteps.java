package org.stepDefintion;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.baseMethods.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojoclass.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps extends Base{
	
	@Given("user has to launch chrome and hit FB url")
	public void user_has_to_launch_chrome_and_hit_FB_url() {
		launchUrl("https://www.facebook.com/");
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		LoginPojo p=new LoginPojo();
		fill(p.getUser(), username);
		fill(p.getPass(), password);
		//d.findElement(By.id("email")).sendKeys(username);
		//d.findElement(By.id("pass")).sendKeys(password);
	}

	@When("user click login button")
	public void user_click_login_button() {
		LoginPojo p=new LoginPojo();
		btnClick(p.getBtnClick());
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Then("user should be in invalid credentials page")
	public void user_should_be_in_invalid_credentials_page() {
//		String url = d.getCurrentUrl();
//		Assert.assertTrue("login check failed", url.contains("privacy_mutation_token"));
		System.out.println("user unable to login");
	}

	@When("user has to enter username and password TdL")
	public void user_has_to_enter_username_and_password_TdL(io.cucumber.datatable.DataTable da) {
	    List<List<String>> li = da.asLists();
		LoginPojo p=new LoginPojo();
		fill(p.getUser(), li.get(1).get(0));
		fill(p.getPass(), li.get(1).get(1));
	  //  d.findElement(By.id("email")).sendKeys(li.get(1).get(0));
	  //  d.findElement(By.id("pass")).sendKeys(li.get(1).get(1));
	}

	@When("user has to enter username and password ODM")
	public void user_has_to_enter_username_and_password_ODM(io.cucumber.datatable.DataTable dt) {
		Map<String, String> mp = dt.asMap(String.class, String.class);
		LoginPojo p1=new LoginPojo();
		fill(p1.getUser(), mp.get("username"));
		fill(p1.getPass(), mp.get("password"));
		// d.findElement(By.id("email")).sendKeys(mp.get("username"));
		// d.findElement(By.id("pass")).sendKeys(mp.get("password"));
	}

	@When("user has to enter username and password TDM")
	public void user_has_to_enter_username_and_password_TDM(io.cucumber.datatable.DataTable dat) {
	   List<Map<String, String>> mp = dat.asMaps();
	   LoginPojo p2=new LoginPojo();
	   fill(p2.getUser(),mp.get(1).get("username"));
	   fill(p2.getPass(),mp.get(1).get("password"));
	  // d.findElement(By.id("email")).sendKeys(mp.get(1).get("username"));
	  // d.findElement(By.id("pass")).sendKeys(mp.get(1).get("password"));
	}
	
	@When("user has to enter username and password")
	public void user_has_to_enter_username_and_password(io.cucumber.datatable.DataTable data) {
		List<String> li = data.asList();
		LoginPojo p3=new LoginPojo();
		  fill(p3.getUser(),li.get(0));
		  fill(p3.getPass(),li.get(1));
	//	d.findElement(By.id("email")).sendKeys(li.get(0));
	//	d.findElement(By.id("pass")).sendKeys(li.get(1));

	}

	@Then("user unable to enter the home page")
	public void user_unable_to_enter_the_home_page() {
		System.out.println("user unable to login");

	}



}
