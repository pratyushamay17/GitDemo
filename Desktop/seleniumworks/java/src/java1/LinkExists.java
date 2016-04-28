package java1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com.au/?gfe_rd=cr&ei=2GjnVqqtBcXN8gfK3qnYAg&gws_rd=ssl");
		try{
		if(d.findElement(By.linkText("Gmail123")).isDisplayed()){
			System.out.println("gmail link exists");
		}
		}
		catch(NoSuchElementException e){
			System.out.println("gmail link doesnt exists");
	}
	d.close();
	}
}
