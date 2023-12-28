package DataProvider;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicProgramOfDataProvider {
@DataProvider
public String[] urls()
{
	String[] arr={"https://demowebshop.tricentis.com/", "https://www.naukri.com/",
	               "https://www.foodpanda.com/","https://denverformen.com/"};
	
return arr;
}

	@Test(dataProvider="urls")
	public void Usage(String testData)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(testData);
	}
	
	}

