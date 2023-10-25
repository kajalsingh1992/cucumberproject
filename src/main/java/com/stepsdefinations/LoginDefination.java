package com.stepsdefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.javabase.JavaBase;
import com.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginDefination extends JavaBase
{	
	LoginPage lp= new LoginPage();

@Given("browserInitilized")

public void browser_initilized() 
{
//getBrowser();
	System.out.println("browser_initilized");
}

@When("enterLoginDetails")
public void enter_login_details()
{
//	lp.enterUserName();
	//lp.enterPassWord();
	//lp.clickLoginButton();
	System.out.println("enter_login_details");
}
@Then("loginVerified")
public void login_verified()
{
	System.out.println("login_verified");
}

@Given("Open the Url")
public void open_the_url() 
{
    getBrowser();
    
}


@When("^Enter the (.*) and (.*)$")
public void enter_the_username_and_password(String username, String password) 
{
	System.out.println(username);
	System.out.println(password);
	WebElement user=driver.findElement(By.name("username"));
	WebElement pass=driver.findElement(By.name("password"));
	user.sendKeys(username);
   pass.sendKeys(password);
	
}


@When("User click on Login button")
public void user_click_on_login_button()
{
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
@Then("User able to open the home page")
public void user_able_to_open_the_home_page()
{
    



}
}