package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	protected void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser browserObj = new Browser();
		String browserName = browserObj.launchBrowser("Chrome");
		System.out.println("Browser Name :" + browserName);
		browserObj.loadUrl();
	}

}
