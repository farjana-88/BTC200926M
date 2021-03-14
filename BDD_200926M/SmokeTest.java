package com.bit;

import org.junit.Test;

import DataBase.TestData;
import Pages.HomePage;
import Pages.JeansPage;
import Pages.Manpage;
import Pages.ProductDetailsPages;

public class SmokeTest extends BaseTest{

	HomePage homePage;
	Manpage manPage;
	JeansPage jeansPage;
	ProductDetailsPages pdp;
	@Test
	public void buyJesntPant() {
		homePage = new HomePage(dr);
		manPage=homePage.MenManu();
		jeansPage=manPage.clickOnJeans();
		pdp=jeansPage.clickOnJeanPant();
		pdp.SelectSizeWaist(TestData.Size[0]);
		pdp.SelectSizeLength();
		pdp.addTocart();
		
	}
	
	
	
	
	
	
}
