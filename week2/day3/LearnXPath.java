package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vidyar@testleaf.com");	
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
		
		String title =driver.getTitle();
		System.out.println("Title"+title);
					
	}

}
