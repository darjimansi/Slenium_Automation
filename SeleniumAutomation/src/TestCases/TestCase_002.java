package TestCases;

import CommonActions.KeyWords;

public class TestCase_002 extends KeyWords {
	
	public static void main(String[] args) {
		
		openBrowser();
		UrlNavigate("https://www.priceline.com/");
		clickButton("//a[@data-id='flights']");
		clickButton("//input[@id='trip-type-one-way']");
		EnterText("//input[@id='flight-departure-airport0']", "Miami");
		EnterText("//input[@id='flight-arrival-airport0']", "India");
		SelectItem("//input[@id='flight-date-range0']","");
		clickButton("//button[@class='sc-bMVAic ZPPpb sc-kkGfuU fxNDjV sc-iwsKbI jBKLKT']");
	}

}
