package testscripts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginTest {
	@Test
	public void Test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://uniformm1.upskills.in/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart fa-fw']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Orders'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='pull-right']//a[@class='btn btn-primary']")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Ranajoy");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Mukherjee");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ranajoy@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("8210143795");
		driver.findElement(By.xpath("//button[@id='button-customer']")).click();
		driver.findElement(By.xpath("//input[@id='input-product']")).sendKeys("FULL SLEEVS SWEAT SHIRT");
		driver.findElement(By.xpath("//button[@id='button-product-add']")).click();
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("Ranajoy");
		driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("Mukherjee");
		driver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys("Kolkata");
		driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys("Kolkata");
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys("700109");
		WebElement element = driver.findElement(By.xpath("//select[@id='input-payment-country']"));
		Select sel = new Select(element);
		sel.selectByVisibleText("India");
		WebElement element1 = driver.findElement(By.xpath("//select[@id='input-payment-zone']"));
		Select sel1 = new Select(element1);
		sel1.selectByVisibleText("West Bengal");
		driver.findElement(By.xpath("//button[@id='button-payment-address']")).click();
	}
}
