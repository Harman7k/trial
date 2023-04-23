package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginPage {

	WebDriver driver;
	
   public void openLoginPage() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
    	driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=HFb-YO-UuAs&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJIRmItWU8tVXVBcyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjU1MDY0OTI5LCJpYXQiOjE2NTUwNjM3MjksImp0aSI6IjM0MmZiYjFkLWEwZGYtNDgyNy05ZDg4LWE5OGNhOTRjNjBmMiIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.Z--ldfEzNWXwH3QiLdkzJxzDmT7HT0tm3OXLPKK7Ikukhlk4eEpcA3CHqSVk6GkhHCi6re0vyt80zlXR0KiMdEOZID55c6rLZfPLVMoTjDDM7BZlk267vJ6fQ2bkCOC3wppJk7k4cVUb8E7cZR2wNThuGj2PuLJ32cgNgF6ee5Fhy2riYvDEgSHpMAkIlCWQFjyTH6mR_QuMDanOr6IoZcYASSs7MWEbAJdCNU0liPYAyjOlcmXCLG7J06oVjB8btvi8Wa8MyC9-Mj0s_SoiWV-5mr4dH-VZAEANi2dhlBI07NcbXLGTRoMKvTQ4mlrCU53r2_AbiAIFg9DsoIJf7Q&preferred_environment=");
    }
	
	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void enterEmailAndPAssword(String a, String b) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
	}
	public void clickOnLoginButton() {
		driver.findElement(By.id("signIn")).click(); 
	}

	public String readErr() {
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
	public void closeBrowser() {
		driver.quit();
	}

	
		
	}



	
	
