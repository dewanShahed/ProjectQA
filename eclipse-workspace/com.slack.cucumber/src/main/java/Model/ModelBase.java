package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModelBase {
	  WebDriver driver;
	     public static Actions act;
	     static WebDriverWait wait;
	     
		 public ModelBase(WebDriver d) {
			driver=d;
		    wait=new WebDriverWait(driver,30);
		    act=new Actions(driver);
             }
         }