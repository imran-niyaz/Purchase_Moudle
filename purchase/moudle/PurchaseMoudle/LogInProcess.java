package PurchaseMoudle;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import MyUtilities.testbase1;

public class LogInProcess extends testbase1 {
	static LogInProcess obj=PageFactory.initElements(driver, LogInProcess.class);
	static credentials infos= new credentials();
		
			@FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]")
		    WebElement firstClick;
	
		    @FindBy(xpath = ".//*[@id='login']")
		    WebElement email;
	
		    @FindBy(xpath = ".//*[@id='password']")
		    WebElement password;
	
		    @FindBy(xpath = ".//*[@id='wrapwrap']/main/div/form/div[4]/button")
		    WebElement singinButton;


	    public void Managerlogin() {
	        driver.get("http://52.39.162.23/web/login");
	        wait.until(ExpectedConditions.visibilityOf(firstClick));
	        firstClick.click();
	    
	        wait.until(ExpectedConditions.visibilityOf(email));
	        email.sendKeys(infos.getManagerEmail());
	       	        
	        wait.until(ExpectedConditions.visibilityOf(password));
	        password.sendKeys(infos.getManagerPassword());
	       	    
	        wait.until(ExpectedConditions.visibilityOf(singinButton));
	        singinButton.click();
	       
	    }
	    public void Userlogin() {
	    	driver.get("http://52.39.162.23/web/login");
	        wait.until(ExpectedConditions.visibilityOf(firstClick));
	        firstClick.click();
	    
	        wait.until(ExpectedConditions.visibilityOf(email));
	        email.sendKeys(infos.getUserEmail());
	       	        
	        wait.until(ExpectedConditions.visibilityOf(password));
	        password.sendKeys(infos.getUserPassword());
	       	    
	        wait.until(ExpectedConditions.visibilityOf(singinButton));
	        singinButton.click();
	    }
	    
	    
}
