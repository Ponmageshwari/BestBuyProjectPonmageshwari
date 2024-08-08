package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.Homepge;
import pages.NavigationofAllmenu;

public class Tc001_MenuNavigation extends ProjectSpecificationMethods{

	@Test

	public void validLoginTest() throws Exception {
		
		Homepge up = new Homepge(driver);
		up.Imageclick();
		NavigationofAllmenu obj = new NavigationofAllmenu(driver);
		obj.TopDeals();
		obj.DealofDay();
		obj.BestBuySells();
		obj.BestBuyMembership();
		obj.creditcard();
		obj.bottomlinkAccessibility();
		obj.Termscondition();
		obj.privacy();
		obj.InterestAds();
		obj.stateprivacy();
		obj.Healthdata();
		
}
}
