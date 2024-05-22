package appium.pageObjects;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appium.abstractComponents.AbstractComponents;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class LoginPage extends AbstractComponents

{
MobileDriver driver;
	
	public LoginPage(MobileDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".android.widget.EditText")
	private MobileElement inputEmail;
	
	@FindBy(xpath="//android.view.View[@content-desc='Log in']")
	private MobileElement loginButton;
	
	public void inputEmail(String email)
	{
		inputEmail.sendKeys(email);
	}
	
	
	
	
}
