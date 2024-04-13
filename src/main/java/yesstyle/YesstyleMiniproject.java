package yesstyle;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YesstyleMiniproject 
{

	public static void main(String[] args) throws IOException 
	{
		
		 
		//WebDriverManager.chromedriver().setup();  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.yesstyle.com/");
	}	
}
