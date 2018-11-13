package TestCases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import CommonActions.KeyWords;

public class TextFile extends KeyWords {
	
	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		  File file = new File("C:\\Users\\HomePC\\Documents\\Zoom\\files\\Students.txt"); 
		  FileReader fr = new FileReader (file);
		  BufferedReader br = new BufferedReader(fr);
		  //BufferedReader br = new BufferedReader(new FileReader(file));
		  openBrowser();
		  UrlNavigate("https://www.ebay.com/");
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    
			  EnterText("//input[@id='gh-ac']", st);
			  System.out.println(st);
			  

}

}
