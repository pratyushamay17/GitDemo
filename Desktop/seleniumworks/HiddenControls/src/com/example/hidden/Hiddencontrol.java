package com.example.hidden;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class Hiddencontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.navigate().to("file:///P:/selenium/hidden.html");
		JavascriptExecutor js=(JavascriptExecutor)d;
	WebElement hiddenbutton=d.findElement(By.xpath("//button"));
		String script="arguments[0].click();";
		js.executeScript(script,hiddenbutton);
		
	}

	private static object ExecuteScript(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
