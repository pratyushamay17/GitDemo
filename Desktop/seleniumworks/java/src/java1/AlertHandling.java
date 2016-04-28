package java1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElement(By.xpath("//input[@id='login1']")).sendKeys("pratyushamay17");
		//to get the text we have entered in textbox
		System.out.println(d.findElement(By.xpath("//input[@id='login1']")).getAttribute("value"));
		System.out.println(d.findElement(By.xpath("//input[@type='submit']")).isEnabled());
		System.out.println(d.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
		System.out.println(d.findElement(By.xpath("//input[@type='submit']")).getAttribute("name"));
		System.out.println(d.findElement(By.xpath("//input[@type='submit']")).getAttribute("type"));
		System.out.println(d.findElement(By.xpath("//input[@type='submit']")).getAttribute("value"));
		d.findElement(By.xpath("//input[@type='submit']")).click();
		Alert a=d.switchTo().alert();
		String err=a.getText();
		System.out.println(err);
		a.accept();
		d.close();
	}

}
