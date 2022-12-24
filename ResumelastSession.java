package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumelastSession {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Seleniumjarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.edubridgeindia.com/login/");
	
		System.out.println("launched url successfully");
		//enter mobilenumber
		driver.findElement(By.id("login_mobile")).sendKeys("7093747216");
		
		//enter password
		driver.findElement(By.id("login_password")).sendKeys("7386665057");
		
		 //click sign in button
		driver.findElement(By.id("btnLoginSubmit")).click();
		
		System.out.println("sign-in successfull");
		
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("//*[@id=\"coursesGridData\"]/div/div/div[1]/div/div/div[2]/div[2]/a")).click();
		System.out.println("Course viewed sucessfully");
		Thread.sleep(2000);
		driver.findElement(By.id("resume_btn2")).click();
		System.out.println("Session started");
		 Thread.sleep(2000);
		driver.quit();
		System.out.println("Automation Completed");
	}

}
