package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomersTest {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://uniformm1.upskills.in/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-user fa-fw']")).click();
		driver.findElement(By.xpath("(//a[text()='Customers'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='pull-right']//a[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Ranajoy");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Mukherjee");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ranajoy27@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9679872329");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("rana@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("rana@123");
		act.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(By.xpath("//i[@class='fa fa-save']")).click();
		
	}

}
