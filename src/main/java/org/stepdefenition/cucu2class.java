package org.stepdefenition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tnp.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class cucu2class extends org.fa.Baseclass {
	
	@Given("To launch the browser and maximize the browser window")
	public void to_launch_the_browser_and_maximize_the_browser_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of facebook page")
	public void to_launch_the_url_of_facebook_page() {
		launchUrl("https://www.facebook.com/");
	    
	}

	@When("Use has to pass the values in email field")
	public void use_has_to_pass_the_values_in_email_field(DataTable d) {
		List<String> l = d.asList();
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys(l.get(0)); 
	}

	@When("User has to pass the values in password field")
	public void user_has_to_pass_the_values_in_password_field(DataTable d) {
		List<List<String>> l = d.asLists();
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(l.get(1).get(1));
	    
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	   
	}



}
