package org.Screenshot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Croma {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bharath\\eclipse-workspace\\Locators\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.croma.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement text=driver.findElement(By.id("js-site-search-input"));
		text.sendKeys("Speaker");
		WebElement btn=driver.findElement(By.id("V01HH11"));
		btn.click();
		List<WebElement> pd=driver.findElements(By.xpath("//a[@class='product__list--name']"));
		System.out.println(pd.size());
		for (int i = 0; i <pd.size(); i++) {
			WebElement w=pd.get(i);
			String s=w.getText();
			System.out.println(s);
			
		}
			
		}
		
		

}
