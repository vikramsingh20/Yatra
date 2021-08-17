package PageObject;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Depart = By.xpath("//input[@id='BE_flight_origin_city']");
	By Going = By.xpath("//input[@id='BE_flight_arrival_city']");
	By DepDate= By.xpath("//input[@id='BE_flight_origin_date']");		
	By Button= By.xpath("//input[@type='submit']");
	public WebElement source() {
	return	driver.findElement(Depart);
	}
	
	public WebElement destination() {
		return driver.findElement(Going);
	}
	
	public WebElement date() {
		return driver.findElement(DepDate);
	}
	
	public WebElement subbuttom() {
		return driver.findElement(Button);
	}
	
	
	
		
	
	
	

}
