package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.telerik.com/contact");

		WebElement select1 =driver.findElement(By.name("DropdownListFieldController_0"));
		Select option1 = new Select(select1);
		option1.selectByIndex(5);
		
		WebElement select2 =driver.findElement(By.name("DropdownListFieldController"));
		Select option2 = new Select(select2);
		option2.selectByVisibleText("UI for React");
		
		WebElement select3 =driver.findElement(By.name("DynamicListFieldController"));
		Select option3 = new Select(select3);
		option3.selectByValue("France");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Textbox-1")).sendKeys("user");
		Thread.sleep(2000);
		driver.findElement(By.id("Textbox-2")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.id("Email-1")).sendKeys("email");
		driver.findElement(By.id("Textbox-3")).sendKeys("ABC");
		driver.findElement(By.id("Textbox-4")).sendKeys("090234");
		driver.findElement(By.id("Textarea-1")).sendKeys("Submit");
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
