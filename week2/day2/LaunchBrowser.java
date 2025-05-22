package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		Thread.sleep(4000);
		driver.findElement(By.id("Login")).click();
		
		String title =driver.getTitle();
		System.out.println("Title"+title);
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
		

	}

}
