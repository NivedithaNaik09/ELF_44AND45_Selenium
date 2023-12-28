package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureColorAndErrormsgInSkillary2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("SPANISH")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("ENGLISH")).click();
		//Thread.sleep(2000);
		driver.findElement(By.partialLinkText("SIGN IN")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("usertype_yes")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupcode")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("remember")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		 WebElement txt = driver.findElement(By.id("email-error"));
		System.out.println(txt.getText());
		System.out.println(txt.getCssValue("color"));
		// TODO Auto-generated method stub

	}

}
