package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.javabase.JavaBase;
import com.propertyreader.PropertyReader;

public class AdminPage extends JavaBase
{
	public static final String ADMIN_BUTTON= "//*[contains(@href,'Admin')]";
	public static final String ADD_BUTTON="//*[@id='app']//div[2]/div[1]/button";
	public static final String SELECT_USERROLE_BUTTON="//*[text()='-- Select --']";
	public static final String EMPLOYEE_NAME="//*[@id=\"app\"]//div/div[2]//input";
	public static final String SELECT_EMPLOYEE_STATUS="//*[@id='app']//div[3]//div[2]/div/div";
	public static final String EMPLOYEE_USER_NAME="//*[@id='app']/div[1]//form//div[2]/input";
	public static final String EMPLOYEE_PASSWORD="//*[@id=\"app\"]//div[2]/div/div[1]/div/div[2]/input";
	public static final String CONFIRM_PASSWORD="//*[@id='app']//form//div[2]/div/div[2]/input";
	public static final String SAVE_BUTTON="//*[@id='app']//form/div[3]/button[2]";	
			
	
	public void clickOnAdmin()
	{		
		JavaBase.onClick(ADMIN_BUTTON);	
	
	}
	public void clickOnAddButton()
	{
		JavaBase.onClick(ADD_BUTTON);	
		
	}
	public void selectUserRole()
	{
		JavaBase.onClickByIndex(SELECT_USERROLE_BUTTON, 0);
		WebElement findElement = driver.findElement(By.xpath("//div[@role='listbox' and class='oxd-select-dropdown --position--bottom']"));		
		findElement.click();
	}
	
	public void enterEmployeeName()
	{
		String dataProperties = PropertyReader.getDataProperties("EmployeeName");
		JavaBase.sendKeys(EMPLOYEE_NAME, dataProperties);
	
	}	
	public void enterEmployeeStatus()
	{		
		Select selectEmployeeStatusButton = new Select(driver.findElement(By.xpath(SELECT_EMPLOYEE_STATUS)));
		selectEmployeeStatusButton.selectByIndex(2);
		
	}
	public void enterEmployeeUserName()
	{
		JavaBase.sendKeys(EMPLOYEE_USER_NAME, PropertyReader.getDataProperties(EMPLOYEE_NAME));
		
	}
	public void enterEmployeePassWord()
	{
		JavaBase.sendKeys(EMPLOYEE_PASSWORD, PropertyReader.getDataProperties(EMPLOYEE_PASSWORD));
					
	}
	public void enterConfirmEmployeePassWord()
	{
		JavaBase.sendKeys(CONFIRM_PASSWORD, PropertyReader.getDataProperties(CONFIRM_PASSWORD));
					
	}
	
	public void clickOnSaveButton()
	{
		JavaBase.onClick(SAVE_BUTTON);
		
		
	}

		
}