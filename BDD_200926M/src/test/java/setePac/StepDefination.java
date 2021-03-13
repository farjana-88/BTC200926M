package setePac;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefination {

	WebDriver dr;
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
	public void end2() {
		
	}
	@Given("^open browser$")
	public void open_browser(DataTable arg1) {
		List<List<String>> browsers=arg1.raw();
		String b =browsers.get(0).get(0);
		
	}

  @Given("^nevigate to url$")
public void nevigate_to_url() throws Throwable {
   dr.get("https://www.facebook.com/"); 
}
 
@When("^User type user id in usertext box$")
public void user_type_user_id_in_usertext_box() throws Throwable {
    dr.findElement(By.id("email")).sendKeys(" 568");
}

@When("^user type password in password box$")
public void user_type_password_in_password_box() throws Throwable {
	 dr.findElement(By.id("pass")).sendKeys("123 ");
}

@When("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
	 dr.findElement(By.id("u_2-O")).click();;
}

@Then("^user should be in his profile page$")
public void user_should_be_in_his_profile_page() throws Throwable {
	 if(dr.findElement(By.id("")).isDisplayed()){
		 System.out.println("i m in profile page");
	 }else {
		 System.out.println("not in profile page");
	 }
}
@Then("^user should not  be in his profile page$")
public void user_should_not_be_in_his_profile_page() throws Throwable {
   Assert.assertFalse(dr.findElement(By.id("")).isDisplayed());
}
@When("^User type \"([^\"]*)\" in usertext box$")
public void user_type_in_usertext_box(String arg1) throws Throwable {
	 dr.findElement(By.id("pass")).sendKeys("aarg1");
}

@When("^user type \"([^\"]*)\" in password box$")
public void user_type_in_password_box(String arg1) throws Throwable {
	 dr.findElement(By.id("pass")).sendKeys(" 1234");
}



















}
