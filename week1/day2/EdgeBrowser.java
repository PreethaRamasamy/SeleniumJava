package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browserObj = new Browser();
		String browserName = browserObj.launchBrowser("Chrome");
		System.out.println("Browser Name :" + browserName);
		browserObj.loadUrl();
	}

}
