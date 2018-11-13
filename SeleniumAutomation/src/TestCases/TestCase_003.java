package TestCases;

import CommonActions.KeyWords;

public class TestCase_003 extends KeyWords {

	public static void main(String[] args) {
		
		openBrowser();
		UrlNavigate("https://www.ebay.com/");
		clickButton("//a[@id='gh-as-a']");
		//wait.until
		EnterText("//input[@id='_nkw']", "Watches");
		clickButton("//input[@id='_mPrRngCbx']");
		EnterInteger("//input[@title='Enter minimum price range value']", 50);
		EnterInteger("//input[@title='Enter maximum price range value']", 100);
		clickButton("//input[@id='LH_ItemConditionUsed']");
		clickButton("//input[@id='LH_FS']");
		clickButton("//button[@id='searchBtnLowerLnk']");
		CloseBrowser();
		
		
		
		
		
	}
}
