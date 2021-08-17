package udemymv.Yatra;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

	public static  WebDriver  driver;
	public static Properties ref;

	public static WebDriver browser() throws IOException{
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		
		ref=new Properties();
		
		FileInputStream files=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Yatra\\src\\main\\java\\udemymv\\Yatra\\data.properties");
		
		ref.load(files);
		
		String str1=ref.getProperty("Browser");
		if(str1.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\New folder (2)\\chromedriver.exe");
		
		driver= new ChromeDriver(options);
		}
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		return driver;
		
		
	}

}
