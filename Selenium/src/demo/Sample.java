package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	driver.findElement(By.xpath("//a[.='Create new account']")).click();
//	Thread.sleep(2000);
//	WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
//	Select s=new Select(ele);
//	Thread.sleep(2000);
//	List<WebElement> te=s.getOptions();
//	Thread.sleep(2000);
//	int count = te.size();
//	Thread.sleep(2000);
//	System.out.println(count);
	
	
}
}
