package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.Checkout;
import pages.Homepge;
import utils.Utility;

public class TC004_Checkout extends ProjectSpecificationMethods {
	@Test
	public void validCheckoutTest() throws IOException {

		Homepge up = new Homepge(driver);
		up.Imageclick();
		Checkout obj = new Checkout(driver);
		obj.brand();
		obj.checkout();
		
}
	
}
