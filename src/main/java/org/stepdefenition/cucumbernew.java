package org.stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tnp.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumbernew extends Baseclass {
	
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To enter the facebook login page")
	public void to_enter_the_facebook_login_page() {
		launchUrl("https://www.facebook.com/");
	    
	}

	@When("To enter value in the email field")
	public void to_enter_value_in_the_email_field() {
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("dinesh123");
	  
	}

	@When("To enter value in the password field")
	public void to_enter_value_in_the_password_field() {
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
	    
	}

	@When("To click the singin button")
	public void to_click_the_singin_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	    
	}



}
