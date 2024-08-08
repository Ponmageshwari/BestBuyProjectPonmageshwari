package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethods;

public class Checkout extends ProjectSpecificationMethods{
	
	@FindBy(xpath = "//span[text()='Cart']")
	WebElement cart;
	
	@FindBy(xpath = "(//input[@name='availability-selection'])[1]")
	WebElement radioselection;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath = "//button[text()='Continue as Guest']")
	WebElement guest;
	
	@FindBy(xpath = "//input[@id='user.emailAddress']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='user.phone']")
	WebElement phone;
	
	@FindBy(xpath = "//span[text()='Continue to Schedule Delivery']")
	WebElement payment;
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='street']")
	WebElement address;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zip;
	
	@FindBy(xpath = "//span[text()='Apply']")
	WebElement apply;
	
public Checkout(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

public void brand() {
	
	SearchandAdditem obj = new SearchandAdditem(driver);
	obj.menuBrand();
}

public void checkout() throws IOException {
	
	click(cart);
	//click(radioselection);
    //explicit wait to element to be loaded
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement ele = driver.findElement(By.xpath("//button[text()='Checkout']"));
	  wait.until(ExpectedConditions.visibilityOf(ele));
      ele.click();
    //using jav ascript executor to clcik the element
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
	//executor.executeScript("arguments[0].click();", ele);
	click(guest);
	sendkeys(firstname,"magesh");
	sendkeys(lastname, "guru");
	sendkeys(address, "madurai");
	sendkeys(city, "madurai");
	WebElement day = driver.findElement(By.id("state"));
	Select sc = new Select(day);
	sc.selectByValue("AL");
	sendkeys(zip, "62520");
	click(apply);
	sendkeys(email, "maheswari26798@gmail.com");
	sendkeys(phone, "9344105359");
	
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
	  wait.until(ExpectedConditions.elementToBeClickable(payment));
	click(payment);
	screenShot("snap");
	
	}

}

