package TestCases;

import CommonActions.KeyWords;

public class TestCase_001 extends KeyWords {
	
	public static void main(String[] args) {
		
		openBrowser();
		UrlNavigate("https://www.ebay.com/");
		EnterText("//input[@id='gh-ac']","Watches");
		clickButton("//input[@id='gh-btn']");
		CloseBrowser();
		
		
	}

}
