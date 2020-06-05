package bdd.myntra.pageactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.myntra.pageelements.MyntraPageElements;
import bdd.myntra.utilites.SetUpDriver;

public class MyntraPageActions {

	MyntraPageElements PageElements;
	
	Actions action = new Actions(SetUpDriver.chromeDriver);
	
	public MyntraPageActions() {
	this.PageElements = new MyntraPageElements ();
	PageFactory.initElements(SetUpDriver.chromeDriver, PageElements);
}
	public void homepage() {
		SetUpDriver.chromeDriver.get("https://www.myntra.com/");
		SetUpDriver.chromeDriver.manage().window().maximize();
		SetUpDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetUpDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}
	public void Esstenials() {	
		action.moveToElement(PageElements.Essentials).build().perform();
	}
	public void  Masks( ) {
		PageElements.Masks.click();
	}
	public void WildCraft() {
		action.moveToElement(PageElements.WildCraft).build().perform();
	}
	public void Masktype() {
		action.moveToElement(PageElements.Masktype).build().perform();
	}
	public void Size () {
		action.moveToElement(PageElements.Size).build().perform();
	}
	public void Add() {
		action.moveToElement(PageElements.Add).build().perform();
	}
	public void Bag() {
		action.moveToElement(PageElements.Bag).build().perform();
	}
	public void Purchase() {
		action.moveToElement(PageElements.Purchase).build().perform();
	}
		



}


