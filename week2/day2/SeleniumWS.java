package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.close();
		}

}
