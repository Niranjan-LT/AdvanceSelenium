package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ResolutionScript {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.get("https://www.facebook.com");
		Thread.sleep(1500);
		WebElement username = driver.findElement(By.id("email"));
		File src = username.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshot/ .jpeg");
		FileHandler.copy(src, dst);
	}

}
