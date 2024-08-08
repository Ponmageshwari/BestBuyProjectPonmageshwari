package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class SearchandAdditem extends ProjectSpecificationMethods{
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	WebElement addcart;
	
	@FindBy(xpath = "//button[text()='Menu']")
	WebElement menu;
	
	public SearchandAdditem(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    public void searchitem() {
    	
    	driver.findElement(By.id("gh-search-input")).sendKeys("Mobile");
    	driver.findElement(By.className("header-search-icon")).click();
    	//driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
    }
 
    public void Addtocart() {
    	
    	click(addcart);
    }
    
    public void menuDepartment() {
    	click(menu);
    	driver.findElement(By.xpath("//button[text()='Appliances']")).click();
    	driver.findElement(By.xpath("//button[text()='Washers & Dryers']")).click();
    	driver.findElement(By.xpath("//a[text()='Electric Dryers']")).click();
    	driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
    }
    
    public void menuBrand() {
    	
    	click(menu);
    	driver.findElement(By.xpath("//button[text()='Brands']")).click();
    	driver.findElement(By.xpath("//a[text()='Samsung']")).click();
    	driver.findElement(By.xpath("//a[text()='Home Appliances']")).click();
    	driver.findElement(By.xpath("//a[text()='Refrigerators']")).click();
    	WebElement ele = driver.findElement(By.xpath("(//a[@class='btn btn-secondary btn-sm'])[3]"));
    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();", ele);
         ele.click();
    	driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
    }
}
