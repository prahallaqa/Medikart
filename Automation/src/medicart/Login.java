package medicart;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;


@Listeners(TestListeners.class)
public class Login extends BaseClass  {

	@Test
	public void Login1() throws InterruptedException {
		
		driver.findElement(By.xpath("//img[@alt='signin_icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mobile_number_input")).sendKeys("9963960661");
		driver.findElement(By.id("getOtp")).click();
		Thread.sleep(20000);
		System.out.println("Login successfully done");
		System.out.println(driver.getTitle());
	}
}
