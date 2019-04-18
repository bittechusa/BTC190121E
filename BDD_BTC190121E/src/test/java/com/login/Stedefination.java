package com.login;

import org.openqa.selenium.chrome.ChromeDriver;

import com.page.CottonPage;
import com.page.HomePage;
import com.page.PDPage;
import com.test.BaseTest;
import com.util.Share;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stedefination {
	HomePage hp;
	CottonPage cp;
	PDPage p;
	@Given("^Nevigate to url$")
	public void nevigate_to_url() throws Throwable {
		BaseTest b=new BaseTest();
		hp=b.openBrowser();
	}

	@When("^user click on cotton menu$")
	public void user_click_on_cotton_menu() throws Throwable {
		cp=hp.clickMenu();
	}

	@When("^User select first product$")
	public void user_select_first_product() throws Throwable {
	   p=cp.clickFProd(); 
	}

	@When("^User select all option of that product$")
	public void user_select_all_option_of_that_product() throws Throwable {
	   System.out.println("hkdf");
	}

	@Then("^User able to finish buying a product$")
	public void user_able_to_finish_buying_a_product() throws Throwable {
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
