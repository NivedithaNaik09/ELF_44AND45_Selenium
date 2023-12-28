package RobotClass;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidingAuthenticationPopUp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdiver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
}
}
