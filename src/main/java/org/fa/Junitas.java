package org.fa;

import org.junit.Assert;
import org.junit.Test;

public class Junitas extends Baseclass{
	
	@Test
	public void tc1() {
		System.out.println("Testcase1");
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		String title = pageTitle();
		String url = pageUrl();
		windowMaximize();
		Newclass n = new Newclass();
		passText("selenium", n.getMail());
		Assert.assertTrue("check the title", title.contains("facebook"));
		passText("12345", n.getPassword());
		
		
		
		

	}


}
