package java1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowsers {
	public static WebDriver d;
	public static int browser;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//public static String browsername;
for(browser=1;browser<=3;browser++){
	if(browser==1){
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("firefox launched");
	}
	else if(browser==2){
		System.setProperty("webdriver.chrome.driver","P:\\selenium\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("chrome launched");
	}
	else if(browser==3){
		System.setProperty("webdriver.ie.driver","P:\\selenium\\IEDriverServer.exe");
		d=new InternetExplorerDriver();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("internet explorer launched");
	}
d.get("https://www.google.com");
String title=d.getTitle();
if(title.equals("Google")){
	System.out.println("google page launched");
}
else{
	System.out.println("google page not launched");
}
d.close();
	}

}
}
