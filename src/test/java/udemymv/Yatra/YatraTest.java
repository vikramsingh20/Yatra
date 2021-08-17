package udemymv.Yatra;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;

public class YatraTest extends BaseTest {

	public WebDriver driver;


	@BeforeTest
	public void landingpage() throws IOException {
		driver=browser();
		driver.manage().window().maximize();
		driver.get(ref.getProperty("Url"));



	}

	@Test(priority = -1)
	public void pageTitle() {

		Assert.assertEquals(driver.getTitle(), "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com");


	}

	@Test(priority = 0)
	public void sourceplace() throws InterruptedException, IOException {
		String str1=ref.getProperty("Source");
		LandingPage ref1= new LandingPage(driver);
		ref1.source().click();
		//Thread.sleep(4000);
		ref1.source().sendKeys(str1);


		List<WebElement> lt=driver.findElements(By.xpath("//div[@class='viewport']/div/div/li/div/p[1]"));

		for(WebElement option:lt) {
			if(option.getText().equalsIgnoreCase(str1))
			{

				option.click();
				break;
			}
		}
	}

	@Test(priority = 1)
	public void destinationplace() {
		String str2=ref.getProperty("Destination");
		LandingPage ref2= new LandingPage(driver);
		ref2.destination().click();
		ref2.destination().sendKeys(str2);
		List<WebElement> lt1=driver.findElements(By.xpath("//div[@class='viewport']/div/div/li/div/p[1]"));

		for(WebElement option1:lt1) {

			if(option1.getText().equalsIgnoreCase(str2))
			{
				option1.click();
				break;
			}
		}

	}


	@Test(priority = 2)
	public void departuredate() throws InterruptedException {
		LandingPage ref3= new LandingPage(driver);
		ref3.date().click();

		driver.findElement(By.xpath("//td[@data-date='31/08/2021']")).click();
		
						

	}

	@Test(priority = 3)
	public void submitbutton_enabled() {
		LandingPage ref4= new LandingPage(driver);
		ref4.subbuttom().isEnabled();
		
	}
	
	
	@Test(priority = 5)
	public void click() {
		LandingPage ref5= new LandingPage(driver);
		ref5.subbuttom().click();
		
	
	}
	@Test(priority = 6)
	public void submitbutton() throws InterruptedException {
		//LandingPage ref5= new LandingPage(driver);
		
		Assert.assertEquals(driver.getTitle(),"Yatra.com | Bengaluru to Delhi flights");
	
	}
	
}