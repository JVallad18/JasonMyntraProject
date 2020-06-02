package bdd.myntra.utilites;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before
	public void beforeactions(Scenario scen) {
		System.out.println("===============Driver Initialization================");
		SetUpDriver.setupChromeDriver();
		System.out.println(scen.getName());
	
}
}
