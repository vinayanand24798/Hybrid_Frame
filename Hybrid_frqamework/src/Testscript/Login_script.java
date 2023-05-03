package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.Fetch_data;
import generic.generic;
import pom.pom;


public class Login_script extends generic
{
	

	

	@Test
	public void test1() 
	
	{
		
		        String un_id = Fetch_data.get_data("sheet1",0,0);
		                      String pwd_id = Fetch_data.get_data("sheet1", 0, 1);
		   pom p = new pom(driver);
	     
	          p.username(un_id);
	           p.pwd(pwd_id);
	          p.login_btn();
		    
		
		
		
	}
       
	
	
	
	
	
}
