package com.pages;
import com.javabase.JavaBase;
import com.propertyreader.PropertyReader;
public class LoginPage 
{
public static final String USER_NAME="name=username";
public static final String PASS_WORD="name=password";
public static final String LOGIN_BUTTON="//button[@type='submit']";
	
	
public static void enterUserName() 

{
	System.out.println(PropertyReader.getDataProperties("UserName"));
    JavaBase.sendKeys(USER_NAME, PropertyReader.getDataProperties("UserName"));
}
public static void enterPassWord() 

{
	 JavaBase.sendKeys(PASS_WORD, PropertyReader.getDataProperties("PassWord"));
	
}
public static void clickLoginButton() 

{
    JavaBase.onClick(LOGIN_BUTTON);
	
	
}



}
