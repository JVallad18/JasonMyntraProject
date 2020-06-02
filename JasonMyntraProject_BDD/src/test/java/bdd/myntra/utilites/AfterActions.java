package bdd.myntra.utilites;

import cucumber.api.java.After;


public class AfterActions {

	@After
	public void afterActions() {
		SetUpDriver.tearDownChromeDriver();
	
}
}
