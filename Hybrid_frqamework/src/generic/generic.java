package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic implements Framework_constant
{
	public  WebDriver driver;
	
      @BeforeMethod
      public void open_app() {
    	  
    	  System.setProperty( gecko_key, gecko_value);
    	      driver = new FirefoxDriver();
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       driver.get("https://www.facebook.com");
    	       
      }  
    	      @AfterMethod
    	      public void close() {
    	    	  
    	         driver.close();
    	    	  
    	    	  
    	    	  
    	      }
    	      
    	       
    	       
    	       
      
}
