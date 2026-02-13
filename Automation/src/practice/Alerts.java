package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		WebElement element1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
//		element1.click();
//		Alert at = driver.switchTo().alert();
//		at.accept();
		WebElement element2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		element2.click();
		Thread.sleep(2000);
		Alert at1 = driver.switchTo().alert();
		at1.dismiss();
//		WebElement element3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
//		element2.click();
//		Thread.sleep(2000);
//		at.sendKeys("Yes");	
	}
}
