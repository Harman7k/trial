package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepDefination {
	

	LoginPage lp = new LoginPage();

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		lp.openLoginPage();
	}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
		String expctedTitle = title;
		String actualTitle = lp.getTitle();
	    Assert.assertEquals(expctedTitle, actualTitle);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password) throws Throwable {
		lp.enterEmailAndPAssword(email, password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		lp.clickOnLoginButton();
	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
		String expectedErr = "Please enter a username or card number without special characters.";
		String actualErr = lp.readErr();
		Assert.assertEquals(expectedErr, actualErr);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
	    lp.closeBrowser();
	}

}
	/*@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	   //open firefox
		//open scotiabankloginpage
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=9W88mDe4ak8&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiI5Vzg4bURlNGFrOCIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjYwNDQ5NjY0LCJpYXQiOjE2NjA0NDg0NjQsImp0aSI6ImJkMDliODRlLWJjM2MtNDVmYy1hYjdlLTg4MjgwZTQ4MzE5YSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.kvPCkbftD9DVKrtXlVPA_HQrUQXC4cDGTr81rVTdp5uu5swmjWJGFwtJVJK38L41WmAKEigFRZvBvDWYHE24dyQoeeNkMnJTlODsAnz5vnL0reji92Pdxyr_o8u3gxfxQIUJzTY3JgMQTL6AgnOczVpmJ5FzzxCIq-oYk6ye2X8Fe5bn3uVD555f7H4erg323TFghoUiogHa-uzRfmcZq_s7hxnKNzfbNVfN6-i3w_3AGOmgsNmVfcokPdibCZvaxUJxboj7KTDWUxAHM20tLf5OsqWta47vnijkuR1A7qa-VCLKaFCLl52NpLpuZfof69FZKsztMgjY3MaXkjyoVg&preferred_environment=");
	}
		@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
	String expectedTitle = title;
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
     Assert.assertEquals(expectedTitle, actualTitle);
		/*if(expectedTitle.equals(actualTitle)) {
			System.out.println("pass");
		}else {
				System.out.println("fail");
			}*/
		//}
	   
	/*@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password) throws Throwable {
		driver.findElement(By.id("usernameInput-input")).sendKeys("gdsgkdgdfkdfgdfdhdhjd#$%");
		driver.findElement(By.name("password")).sendKeys("adsfsdggsdg234");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.id("signIn")).click(); 
	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
		String expectedErr = "Please enter a username or card number without special characters.";
		 String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		 System.out.println(actualErr);
		Assert.assertEquals(expectedErr, actualErr);
		 /*if(expectedErr.equals(actualErr)) {
			 System.out.println("Pass");
		 }else {
			 System.err.println("Fail");
		 }*/
	//}

	//@Then("^user quit$")
	//public void user_quit() throws Throwable {
		//driver.quit();
	    
	   //System.out.println("Close browser");
	//}


