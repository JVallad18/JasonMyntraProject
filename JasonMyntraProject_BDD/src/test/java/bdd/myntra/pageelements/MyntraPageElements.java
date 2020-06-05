package bdd.myntra.pageelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraPageElements {

	@FindBy(xpath="//*[@id=\'desktop-header-cnt\']/div[2]/nav/div/div[5]/div/a")
	public WebElement Essentials;
	
	@FindBy(xpath="//*[@id=\'desktop-header-cnt\']/div[2]/nav/div/div[5]/div/div/div/div/li/ul/li[1]/a")
	public WebElement Masks;
	
	@FindBy(xpath="//*[@id=\'mountRoot\']/div/div[1]/main/div[3]/div[1]/section/div/div[2]/div[3]/div[2]/ul/li[74]/label")
	public WebElement WildCraft;
	
	@FindBy(xpath="//*[@id=\'desktopSearchResults\']/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")
	public WebElement Masktype;
	
	@FindBy(xpath="//*[@id=\'sizButtonsContainer\']/div[2]/a[2]/div/div[1]/button/p")
	public WebElement Size;
	
	@FindBy(xpath="//*[@id=\'mountRoot\']/div/div/div/main/div[2]/div[2]/div[3]/div/a/span[1]")
	public WebElement Add;
	
	@FindBy(xpath="//*[@id=\'desktop-header-cnt\']/div[2]/div[2]/a[2]/span[1]")
	public WebElement Bag;
	
	@FindBy(xpath="//*[@id=\'appContent\']/div/div/div/div/div/div[2]/div[3]/a/div")
	public WebElement Purchase;


	
	
	
}
