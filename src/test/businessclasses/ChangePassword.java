package test.businessclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.facebook.pages.AccountSettings;
import com.selenium.facebook.pages.LandingPage;
import com.selenium.facebook.pages.LoginPage;
import com.selenium.facebook.pages.TopMenu;

public class ChangePassword {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		LandingPage landingPage = lp.doLogin("vivek7124@gmail.com","1983130532blue");
		
		TopMenu topMenu = PageFactory.initElements(driver, TopMenu.class);
		AccountSettings acctSettings = topMenu.gotoAccountSettings();
		acctSettings.changePassword("1983130532blue", "Test123");

	}

}
