package abc;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BaseTest;

public class step {
	BaseTest bb=new BaseTest();
	HomePage hp;
	ProfilePage pf;
	
	@Before
	public void start() {
		
	}
	@After
	public void end() {
		
	}
	
	@Before("@smoke")
	public void start1() {
		
	}
	@After("@smoke")
	public void end1() {
		
	}
	@Given("^open browser$")
	public void open_browser(DataTable arg1) throws Throwable {
	   List<List<String>> browsers=arg1.raw();
	   String b=browsers.get(1).get(0);
	  bb.openBrowser(b);
	}
	@Given("^nevigate to url$")
	public void nevigate_to_url() throws Throwable {
	  hp= bb.gotoURL();
	}

	public void user_enters_testuser_and_Test(DataTable usercredentials) throws Throwable {
		 
		 //Write the code to handle Data Table
		 List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		 dr.findElement(By.id("log")).sendKeys(data.get(0).get("Username")); 
		     dr.findElement(By.id("pwd")).sendKeys(data.get(0).get("Password"));
		     dr.findElement(By.id("login")).click();
		           }
	@When("^user type userid in usertext box$")
	public void user_type_userid_in_usertext_box() throws Throwable {
	  hp.typeUserId();
	}

	@When("^user type password in password box$")
	public void user_type_password_in_password_box() throws Throwable {
		hp.typePass();
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		pf=hp.clickLogin();
	}

	@Then("^user should be in his profile page$")
	public void user_should_be_in_his_profile_page() throws Throwable {
	   pf.verifyProfilePage();
	}
	@Then("^user should not be in his profile page$")
	public void user_should_not_be_in_his_profile_page() throws Throwable {
	   Assert.assertFalse(dr.findElement(By.id("")).isDisplayed());
	}
	@When("^user type <\"([^\"]*)\"> in usertext box$")
	public void user_type_in_usertext_box(String arg1) throws Throwable {
		dr.findElement(By.id("pass")).sendKeys(arg1);
	} 

	@When("^user type <\"([^\"]*)\"> in password box$")
	public void user_type_in_password_box(String arg1) throws Throwable {
		dr.findElement(By.id("pass")).sendKeys(arg1);
	}
}
}
