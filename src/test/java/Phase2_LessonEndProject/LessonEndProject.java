package Phase2_LessonEndProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LessonEndProject {
	
	WebDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void testfacbookAuthentication() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@id='u_0_5_oA']//font//font[contains(text(),'log in')]")).click();
	    Thread.sleep(2000);
	}
	@AfterEach
	public void teardown()
	{
		driver.close();
	}
}

