package LIbraryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class BasePage {

	//public void InitializeBrowser() throws IOException
	
	public static void main(String[] args) throws IOException 
		
	
  {

		System.setProperty("webdriver.chrome.driver", Utility_Class.gettestdata("chromepath"));

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(Utility_Class.gettestdata("url"));

	
}
}
