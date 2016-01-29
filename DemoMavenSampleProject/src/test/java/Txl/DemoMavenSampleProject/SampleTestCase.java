/*package Txl.DemoMavenSampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;



public class SampleTestCase {
	
	public static WebDriver driver;

	@BeforeTest
	public static void startUp()
	{
	
		//driver = new ChromeDriver();	
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testDownload() throws Exception 
	{
		driver.get("https://github.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automationtest");

		driver.findElement(By.xpath("//input[@name='q']")).submit();		
	}
	
	@AfterTest
	public static void tearDown()
	{
		driver.close();
		driver.quit();
	}
}

*/