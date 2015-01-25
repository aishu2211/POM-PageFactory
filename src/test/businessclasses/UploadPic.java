package test.businessclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.facebook.pages.LandingPage;
import com.selenium.facebook.pages.LoginPage;
import com.selenium.facebook.pages.PersonalProfile;

public class UploadPic {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		LandingPage landingPage = lp.doLogin("vivek7124@gmail.com","1983130532blue");
		PersonalProfile personalProfile = landingPage.gotoProfile();
		personalProfile.changeProfilePic("C:\\temp\\mypic.jpg");

	}

}
