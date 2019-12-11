package org.Screenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bharath\\eclipse-workspace\\Locators\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement text=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions at=new Actions(driver);
		at.moveToElement(text).perform();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		at.contextClick().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\bharath\\eclipse-workspace\\org.Screenshot\\Screenshot\\g.png");
		FileUtils.copyDirectoryToDirectory(src, desc);

	}

}
