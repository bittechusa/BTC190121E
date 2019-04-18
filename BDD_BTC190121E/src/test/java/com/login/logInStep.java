package com.login;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logInStep 
{
	WebDriver dr;
	@Before
	public void before()
	{
		System.out.println("start");
	}
	@After
	public void end()
	{
		System.out.println("end");
	}
	@Before("@smoke")
	public void before1()
	{
		System.out.println("start");
	}
	@After("@smoke")
	public void end1()
	{
		System.out.println("end");
	}
	
	
	@Given("^open browser$")
	public void open_browser(DataTable arg1) throws Throwable {
	    List<List<String>> browsers=arg1.raw();
	    String b=browsers.get(0).get(0);
	    if(b.equals("chrome"))
	    {
	    	System.out.println("chrome");
	    }
	    else if(b.equals("firefox"))
	    {
	    	System.out.println("firefox");
	    }
	}

	@Given("^go to url$")
	public void go_to_url() throws Throwable {
	  dr.get("http://www.facebook.com");
	}

	@When("^user type userid and password$")
	public void user_type_userid_and_password() throws Throwable {
	   System.out.println("user and pass");
	}

	@When("^user click signin button$")
	public void user_click_signin_button() throws Throwable {
	   System.out.println("click button");
	}

	@Then("^user will able to see his profile page$")
	public void user_will_able_to_see_his_profile_page() throws Throwable {
	    System.out.println("login succesfull");
	}

	@When("^user type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and(String arg1, String arg2) throws Throwable {
	   System.out.println(arg1+"+"+arg2);
	}

}
