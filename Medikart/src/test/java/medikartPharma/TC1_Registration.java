package medikartPharma;

import org.openqa.selenium.chrome.ChromeDriver;

import medicartPharma.Registartion_Page;

public class TC1_Registration {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		Registartion_Page rp = new Registartion_Page(driver);
		rp.GoTo();
		rp.Login_Registor();
		rp.Create_Account_Button();
		rp.LoginThrowWhatsappNo("9963960661", "prahallaqa@gmail.com");
	}
}