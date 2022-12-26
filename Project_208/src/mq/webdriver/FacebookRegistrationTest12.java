package mq.webdriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class FacebookRegistrationTest12 
{
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  

  @Test
  public void facebookRegistration() 
  {
	  
    driver.get("https://www.facebook.com/reg");
    driver.manage().window().setSize(new Dimension(748, 540));
    driver.findElement(By.name("firstname")).sendKeys("Ajay");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys("Krishna");
    driver.findElement(By.name("reg_email__")).click();
    driver.findElement(By.name("reg_email__")).sendKeys("ajaykrishna@gmail.com");
    driver.findElement(By.name("reg_email_confirmation__")).click();
    driver.findElement(By.xpath("//div[3]/div/div/div/input")).sendKeys("ajaykrishna@gmail.com");
    driver.findElement(By.id("password_step_input")).click();
    driver.findElement(By.id("password_step_input")).sendKeys("admin@123");
    driver.findElement(By.id("day")).click();
    {
      WebElement dropdown = driver.findElement(By.id("day"));
      dropdown.findElement(By.xpath("//option[. = '25']")).click();
    }
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'Sep']")).click();
    }
    driver.findElement(By.id("year")).click();
    {
      WebElement dropdown = driver.findElement(By.id("year"));
      dropdown.findElement(By.xpath("//option[. = '2000']")).click();
    }
    driver.findElement(By.xpath("//span[2]/input")).click();
  }
  
  
  @Before
  public void setUp() 
  {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() 
  {
    driver.quit();
  }
  
}
