package com.javabase;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.propertyreader.PropertyReader;
public class JavaBase 
{
public static WebDriver driver;	

public  void getBrowser()
{
	String browser= PropertyReader.getConfigProperties("browser");
	switch(browser)
	{
	case "chrome":
	{
		driver= new ChromeDriver();
		break;
	}
	case "firefox":
	{
		driver= new FirefoxDriver();
		break;
	}
	case "internetExplorer":
	{
		driver= new InternetExplorerDriver();
		break;
	}
	case "Edge":
	{
		driver= new EdgeDriver();
		break;
	}

	default:break;
	}

	driver=new ChromeDriver();
	driver.get(PropertyReader.getConfigProperties("Server_url"));
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
	 
	 
}
public static By getLocation(String locator)
{
	By result=null;
	if(locator.startsWith("//"))
	{
		result= By.xpath(locator);
	}
	if(locator.startsWith(".//"))
	{
		result= By.xpath(locator);
	}
	if(locator.startsWith("name="))
	{
		result= By.name(locator.replace("name=", ""));
	}
	if(locator.startsWith("css="))
	{
		result= By.cssSelector(locator.replace("css=", ""));
	}
	if(locator.startsWith("linkText="))
	{
		result= By.linkText(locator.replace("linkText=", ""));
	}
	if(locator.startsWith("id="))
	{
		result= By.id(locator.replace("id=", ""));
	}
	return result;
}
public static void sendKeys(String locator, String value)
{
	
	WebElement sendKeyss=clickOnSendKey(locator, Duration.ofSeconds(60));
			sendKeyss.sendKeys(value);
			
}
public static void onClick(String locator)
{
	WebElement sendKeyss=clickOnButton(locator);
	sendKeyss.click();
}
public static WebElement clickOnSendKey(String locator, Duration waitt)
{
	
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(60));
	WebElement webElement=wait.until(ExpectedConditions.visibilityOfElementLocated(getLocation(locator)));
	return webElement;
}
	 
public static WebElement clickOnButton(String locator)
{
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(60));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(getLocation(locator)));
}
	
public static void onClickJavaScript(String locator)
{
	WebElement element=driver.findElement(By.xpath(locator));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element);	
}
static public void onClickByIndex(String locator, int index)
{
	List<WebElement> userRoleButton = driver.findElements(getLocation(locator));
	WebElement webElement = userRoleButton.get(index);
	webElement.click();
}
	



}