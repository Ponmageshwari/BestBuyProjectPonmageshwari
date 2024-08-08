package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class Signup extends ProjectSpecificationMethods {
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement Lastname;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id = "fld-p1")
	WebElement Password;
	
	@FindBy(id = "reenterPassword")
	WebElement Reenterpass;
	
	@FindBy(id = "phone")
	WebElement Mobile;
	
	@FindBy(xpath = "//button[text()='Create an Account']")
	WebElement CreateAccount;
public Signup(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

public Signup Firstname(String enterfirstname) {
	  
	  sendkeys(firstname, enterfirstname);
	  
	  return this;
}

public Signup  lastname(String enterLastname) {
	  
	  sendkeys(Lastname, enterLastname);
	  return this;
}

public Signup email(String enteremail) {
	  
	  sendkeys(Email, enteremail);
	  return this;
}

public Signup password(String enterpass) {
	
	sendkeys(Password, enterpass);
	return this;
}

public Signup reenterpass(String enterrepass) {
	
	sendkeys(Reenterpass, enterrepass);
	return this;
}

public Signup Mobilenumber(String entermobile) {
	
	sendkeys(Mobile, entermobile);
	return this;
}

public Homepge Buttonclick() {
	
	click(CreateAccount);
	return new Homepge(driver);
}

}
