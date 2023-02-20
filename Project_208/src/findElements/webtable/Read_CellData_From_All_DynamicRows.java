package findElements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_CellData_From_All_DynamicRows {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		
		//Locating table at webpage
		WebElement Table=driver.findElement(By.xpath("//table[contains(@id,'tbl_sector0')]"));
		
		//Finding list of rows available under table
		List<WebElement> Rows=Table.findElements(By.tagName("tr"));
		Rows.remove(0);  //It remove header row from table
		
		
		for (int i = 0; i <Rows.size(); i++) 
		{
			//Target Each row
			WebElement DynamicRow=Rows.get(i);
			
			//Read All cells available under each row
			List<WebElement> Cells=DynamicRow.findElements(By.tagName("td"));
			
			String Sharename=Cells.get(0).getText();
			String LTPPrice=Cells.get(2).getText();
		
			System.out.println(Sharename+"   "+LTPPrice);
		}

	}

}
