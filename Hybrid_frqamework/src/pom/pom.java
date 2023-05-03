package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom 
{

	@FindBy(xpath="//input[@id='email']")
	private WebElement un_ele;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pwd_ele;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login_ele;
	
	
	
	
	public pom(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	


	public void  username(String un_id1)
	{
		 
		un_ele.sendKeys( un_id1);
	}
	public void pwd(String pwd_id1) {
		pwd_ele.sendKeys(pwd_id1);
		
	}
	
	public void login_btn() {
		
		login_ele.click();
	}
	
}
