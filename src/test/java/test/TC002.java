package test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.Homepge;
import pages.Signup;

public class TC002 extends ProjectSpecificationMethods {
	
@BeforeTest
	public void setup() {
		
		sheetname ="Signup";
	}
	@Test(dataProvider = "getData")
	
	public void Testcase(String name,String name1,String name2,String name3,String name4,String name5) {
	
	Homepge obj1=new Homepge(driver);
	obj1.Imageclick();
	obj1.clickAccount();
	obj1.clickCreateAccount();
	Signup up = new Signup(driver);
	up.Firstname(name);
	up.lastname(name1);
	up.email(name2);
	up.password(name3);
	up.reenterpass(name4);
	up.Mobilenumber(name5);
	up.Buttonclick();
	
	}}
