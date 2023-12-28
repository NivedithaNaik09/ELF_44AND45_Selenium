package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopHandlingUsingRobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdiver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_E);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_T);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_H);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		robo.keyRelease(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_E);
		robo.keyRelease(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_H);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_ENTER);
}
}
