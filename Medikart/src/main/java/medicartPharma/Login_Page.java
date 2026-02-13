package medicartPharma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "wd-tools-text")
	WebElement Login_Text;

	public void Login_Text() throws InterruptedException {
		Login_Text.click();
		Thread.sleep(3000);
	}

	@FindBy(id = "username")
	WebElement UserName;
	@FindBy(id = "password")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit;

	public void Login(String Username, String password) throws InterruptedException {
		UserName.sendKeys(Username);
		Password.sendKeys(password);
		Submit.click();
		Thread.sleep(3000);
		System.out.println("Login successfully done");
		System.out.println(driver.getTitle());
	}
}
