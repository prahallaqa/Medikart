package medikartPharma;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import medicartPharma.Login_Page;
import medicartPharma.Registartion_Page;

public class TC2_Login {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Registartion_Page rp = new Registartion_Page(driver);
		rp.GoTo();
		Login_Page lp = new Login_Page(driver);
		lp.Login_Text();
		lp.Login("perumallaprahallareddy@gmail.com", "Prahalla@2026");
	}
}
