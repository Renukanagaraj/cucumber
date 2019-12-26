package stepDefinitions;

import org.openqa.selenium.WebDriver;

import CommanFunctions.CommanFunction;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class LoginValidation {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	    driver=CommanFunction.startBrowser("chrome");
	 
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	    CommanFunction.openApplication(driver);
	    
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
	    CommanFunction.waitForElement(driver,"id","username", "10");
	  
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
	   	CommanFunction.typeAction(driver,"name", "username", "admin"); 
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
	   CommanFunction.waitForElement(driver,"id","password", "20");
	    
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	   	  CommanFunction.typeAction(driver, "id", "password", "master");
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
	   CommanFunction.clickAction(driver,"id", "btnsubmit");
	    
	}

	@When("^wait For Logout$")
	public void wait_For_Logout() throws Throwable {
	  CommanFunction.waitForElement(driver,"id","logout", "10");
	   
	}

	@When("^Click On Logout$")
	public void click_On_Logout() throws Throwable {
	   CommanFunction.clickAction(driver,"id", "logout");
	  
	}

	@When("^Wait For OK$")
	public void wait_For_OK() throws Throwable {
	  CommanFunction.waitForElement(driver,"xpath","//button[contains(text(),'OK!')]","10");
	   
	}

	@When("^Click On Ok$")
	public void click_On_Ok() throws Throwable {
	  CommanFunction.clickAction(driver,"xpath","//button[contains(text(),'OK!')]" );
	    
	}

	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {
	   
	   CommanFunction.closeBrowser(driver);
	}


}
