package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class NavigationofAllmenu extends ProjectSpecificationMethods{
	
	public NavigationofAllmenu(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void TopDeals() {
		
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		String ActualtopDealTitle = driver.getTitle();
		String ExpectedtopDealTitle = "Top Deals";
		
		if(ActualtopDealTitle.contains(ExpectedtopDealTitle)) {
			
			System.out.println("The title of the page is:"+ActualtopDealTitle);
		}
		
		else {
			
			System.out.println("It does not go to top deals page");
			
		}
	}
	
	public void DealofDay() {
		
		driver.findElement(By.xpath("//a[text()='Deal of the Day']")).click();
		String ActualDealdayTitle = driver.getTitle();
		String ExpectedDealdayTitle = "Deal of the Day";
   if(ActualDealdayTitle.contains(ExpectedDealdayTitle)) {
			
			System.out.println("The title of the page is:"+ActualDealdayTitle);
		}
		
		else {
			
			System.out.println("It does not go to Deal of the Day page");
			
		}
	}
	
	public void BestBuySells() {
		
		driver.findElement(By.xpath("//a[text()='Yes, Best Buy Sells That']")).click();
		String ActualBestsellTitle = driver.getTitle();
		String ExpectedBestsellTitle = "Best Buy";
    if(ActualBestsellTitle.contains(ExpectedBestsellTitle)) {
			
			System.out.println("The title of the page is:"+ActualBestsellTitle);
		}
		
		else {
			
			System.out.println("It does not go to Best Buy Sells page");
			
		}
	}
	
	public void BestBuyMembership() {
		
		driver.findElement(By.xpath("//a[text()='My Best Buy Memberships']")).click();
		String ActualBestmemberTitle = driver.getTitle();
		String ExpectedBestmemberTitle = "Best Buy";
    if(ActualBestmemberTitle.contains(ExpectedBestmemberTitle)) {
			
			System.out.println("The title of the page is:"+ActualBestmemberTitle);
		}
		
		else {
			
			System.out.println("It does not go to Best Buy Memebrship page");
			
		}
	}
	
	public void creditcard() {
		
		driver.findElement(By.xpath("//a[text()='Credit Cards']")).click();
		String ActualcreditcardTitle = driver.getTitle();
		String ExpectedcreditcardTitle = "Credit Card";
		
   if(ActualcreditcardTitle.contains(ExpectedcreditcardTitle)) {
			
			System.out.println("The title of the page is:"+ActualcreditcardTitle);
		}
		
		else {
			
			System.out.println("It does not go to Creditcard page");
			
		}
		
	}
	public void bottomlinkAccessibility() {
		
		//Scrolling down to bottom using javascript executor
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Accessibility']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		ele.click();
		String title = driver.getTitle();
		String Exptitle = "Accessibility";
		
		if(title.contains(Exptitle)) {
			
			System.out.println("The title of the page is:"+title);
		}
		
		else {
			
			System.out.println("It does not go to Accessibility page");
			
		}
		}
	public void Termscondition() {
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Terms & Conditions']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		ele.click();
		String title = driver.getTitle();
		String Exptitle = "Terms";
		
		if(title.contains(Exptitle)) {
			
			System.out.println("The title of the page is:"+title);
		}
		
		else {
			
			System.out.println("It does not go to Terms & Conditions page");
			
		}
	}
	
	public void privacy() {
			
			WebElement ele = driver.findElement(By.xpath("//a[text()='Privacy']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", ele);
			ele.click();
			String title = driver.getTitle();
			String Exptitle = "Privacy";
			
			if(title.contains(Exptitle)) {
				
				System.out.println("The title of the page is:"+title);
			}
			
			else {
				
				System.out.println("Error : It does not go to Privacy page");
				
			}
	}
	
	public void InterestAds() {
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Interest-Based Ads']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		String title = driver.getTitle();
		String Exptitle = "Interest";
		if(title.contains(Exptitle)) {
			
			System.out.println("The title of the page is:"+title);
		}
		
		else {
			
			System.out.println("Error : It does not go to Interest Based Ads page");
			
		}
		
	}
	
  public void stateprivacy() {
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='State Privacy Rights']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		String title = driver.getTitle();
		String Exptitle = "State";
		if(title.contains(Exptitle)) {
			
			System.out.println("The title of the page is:"+title);
		}
		
		else {
			
			System.out.println("Error : It does not go to State Privacy Rights page");
			
		}
		}
  
  public void Healthdata() {
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Health Data Privacy']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		String title = driver.getTitle();
		String Exptitle = "Health";
		if(title.contains(Exptitle)) {
			
			System.out.println("The title of the page is:"+title);
		}
		
		else {
			
			System.out.println("Error : It does not go to State Privacy Rights page");
			
		}}
  
  public void Personaldata() {
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Do Not Sell/Share My Personal Information']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		String title = driver.getTitle();
		String Exptitle = "Personal";
		if(title.contains(Exptitle)) {
			
			System.out.println("The title of the page is:"+title);
		}
		
		else {
			
			System.out.println("Error : It does not go to State Privacy Rights page");
			
		}}
  
  public void Sensitive() {
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Limit Use of My Sensitive Personal Information']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		String title = driver.getTitle();
		String Exptitle = "Best";
		if(title.contains(Exptitle)) {
			
			System.out.println("The title of the page is:"+title);
		}
		
		else {
			
			System.out.println("Error : It does not go to Limit Use of My Sensitive Personal Information page");
			
		}}
  
  public void TargetAd(){
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Targeted Advertising Opt Out']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		String title = driver.getTitle();
		String Exptitle = "Start";
		if(title.contains(Exptitle)) {
			
			System.out.println("The title of the page is:"+title);
		}
		
		else {
			
			System.out.println("Error : It does not go to Targeted Advertising opt out page");
			
		}}
  
  public void SupplyChain(){
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='CA Supply Chain Transparency Act']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		String title = driver.getTitle();
		String Exptitle = "Supply";
		if(title.contains(Exptitle)) {
			
			System.out.println("The title of the page is:"+title);
		}
		
		else {
			
			System.out.println("Error : It does not go to CA Supply Chain Transparency Act page");
			
		}}
		
	}
	
	
		
		
	


