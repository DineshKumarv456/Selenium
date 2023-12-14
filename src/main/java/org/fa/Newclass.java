package org.fa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newclass extends Baseclass{
	
	public Newclass() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "email")
	private WebElement mail;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement button;

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
	}
	
	

}
