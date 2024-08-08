package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class Homepge extends ProjectSpecificationMethods{
	
	public Homepge(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void Imageclick() {
		
		driver.findElement(By.xpath("//h4[text()='United States']")).click();
	}
	public Homepge clickAccount() {
		
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		return this;
	}
 public void clickCreateAccount() {
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		
	}
      
}
