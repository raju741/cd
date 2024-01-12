package requre;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Requre_demo {

	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void browser() {

		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 1)

	public void signup() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@id=\"signin2\"]")).click();

		driver.findElement(By.xpath("//input[@id=\"sign-username\"]")).sendKeys("balubalra741@gmail.com");

		driver.findElement(By.xpath("//input[@id=\"sign-password\"]")).sendKeys("balu2227@");

		driver.findElement(By.xpath("//button[@onclick=\"register()\"]")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("(//*[text()=\"Close\"])[2]")).click();
	}

	@Test(priority = 2)
	public void login() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("login2")).click();

		driver.findElement(By.id("loginusername")).sendKeys("balubalra741@gmail.com");

		driver.findElement(By.id("loginpassword")).sendKeys("balu2227@");

		driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();

	}

}
