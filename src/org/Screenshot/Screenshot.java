package org.Screenshot;

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
  
public class Screenshot {
	
	public static void main(String[] args)  {			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bharath\\eclipse-workspace\\Locators\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement text=driver.findElement(By.id("inputValEnter"));
		text.sendKeys("nike shoe");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		search.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement shoe=driver.findElement(By.xpath("//img[@title='Nike Airmax 2017 Grey Running Shoes']"));
		shoe.click();
		//windows handling
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> one=driver.getWindowHandles();
		for (String s : one) {
			if(!(parent.equals(s))) {
				driver.switchTo().window(s);
			}
		}
		WebElement tc=driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/offers/pnb-tnc']"));
		tc.click();
		String parent1=driver.getWindowHandle();
		System.out.println(parent1);
		Set<String> two=driver.getWindowHandles();
		for (String s1 : two) {
			if(!(parent1.equals(s1))) {
				driver.switchTo().window(s1);
			}
		}
		WebElement detail=driver.findElement(By.xpath("//h2[text()='Detailed Terms & Conditions']"));
		String texts=detail.getText();
		System.out.println(texts);
	}
	
		

	}


