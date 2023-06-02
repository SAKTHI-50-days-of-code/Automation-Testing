package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ssaba\\Downloads\\browserdrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com//");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Chennai"+Keys.ENTER);
		driver.close();

	}

}
