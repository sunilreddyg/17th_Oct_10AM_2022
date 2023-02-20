package findElements.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_ExpectedRecord_Presented_At_Table {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		
		//Locating table at webpage
		WebElement Table=driver.findElement(By.xpath("//table[contains(@id,'tbl_sector0')]"));
		
		if(Table.getText().contains("ICICI Bank Ltd"))
			System.out.println("Record Presented at table");
		else
			System.out.println("Record is not presented at table");
		
		
		

	}

}
