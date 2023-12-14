package org.stepdefenition;

import org.junit.After;
import org.junit.Before;
import org.tnp.Baseclass;

public class Hookclass extends Baseclass {
	
	@Before
	private void precon() {
		launchBrowser();
		windowMaximize();

	}
	
	@After
	private void postcon() {
		closeEntireBrowser();

	}
	

}
