package appium.abstractComponents;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;

public class AbstractComponents 
{
	MobileDriver driver;
	TouchAction TouchAction;
	Actions Actions;

	public AbstractComponents(MobileDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public TouchAction touchAction(int a, int b)
	{
		TouchAction TouchAction = new TouchAction(driver);
		return TouchAction;
		
	}
	
	public Actions Action(MobileDriver driver)
	{
		Actions Actions = new Actions(driver); 
		return Actions;
	}
}
