package hackathon;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By; 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.firefox.*;

import java.util.concurrent.*;
public class Controller {



	public class myclass {




	}
	public static void main(String[] args) {

		//initialize Chrome driver
		System.setProperty("webdriver.chrome.driver", "//Users//harish//Downloads//chromedriver");        
		WebDriver driver = new ChromeDriver(); 

		//Open gmail
		driver.get("http://osxlthbehl.local:8090/controller/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Enter userd id
		WebElement element = driver.findElement(By.id("userNameInput"));
		element.sendKeys("admin");

		//wait 5 secs for  userid to be entered
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Enter Password
		WebElement element1 = driver.findElement(By.id("passwordInput"));
		element1.sendKeys("admin");
		element.submit();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//Submit button
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//The below method will save the screen shot in d drive with name "screenshot.png"
		try {
			FileUtils.copyFile(scrFile, new File("//Users//harish//Downloads//screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		driver.close();



	}





}
