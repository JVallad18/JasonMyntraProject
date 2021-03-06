package bdd.myntra.stedef;

import bdd.myntra.pageactions.MyntraPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraStepDef {

	MyntraPageActions PageActions = new MyntraPageActions();
	
	@Given("^Myntra Homepage is launched\\.$")
	public void myntra_Homepage_is_launched() throws Throwable {
	PageActions.homepage();        
	 //Im i suppose to add anything else?      
	}

	@When("^Customer Mouse over essential dropbox$")
	public void customer_Mouse_over_essential_dropbox() throws Throwable {
	PageActions.Esstenials();        
	       
	}

	@When("^Customer click on masks$")
	public void customer_click_on_masks() throws Throwable {
	PageActions.Masks();       
	       
	}

	@When("^Customer should click on Wildcraft brand$")
	public void customer_should_click_on_Wildcraft_brand() throws Throwable {
	 PageActions.WildCraft();       
	       
	}

	@When("^Customer click On (\\d+)pcs (\\d+) layer reusable masks$")
	public void customer_click_On_pcs_layer_reusable_masks(int arg1, int arg2) throws Throwable {
	  PageActions.Masktype();      
	       
	}

	@When("^Customer click on size$")
	public void customer_click_on_size() throws Throwable {
	  PageActions.Size();      
	       
	}

	@When("^Customer click on Add to Bag$")
	public void customer_click_on_Add_to_Bag() throws Throwable {
	   PageActions.Bag();     
	       
	}

	@When("^Customer click on Go to bag$")
	public void customer_click_on_Go_to_bag() throws Throwable {
	  PageActions.Bag();     
	       
	}

	@Then("^Customer click on Place Order$")
	public void customer_click_on_Place_Order() throws Throwable {
	   PageActions.Purchase();     
	       
	}




}




