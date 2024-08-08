package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.Homepge;
import pages.SearchandAdditem;

public class TC003_SearchAdditem extends ProjectSpecificationMethods{

	@Test
public void validLoginTest() throws Exception {
		
		Homepge up = new Homepge(driver);
		up.Imageclick();
		SearchandAdditem obj = new SearchandAdditem(driver);
		//obj.searchitem();
		//obj.Addtocart();
		//obj.menuDepartment();
		obj.menuBrand();
}
}
