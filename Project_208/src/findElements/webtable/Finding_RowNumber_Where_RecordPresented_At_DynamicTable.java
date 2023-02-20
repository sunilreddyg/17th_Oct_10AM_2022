package findElements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_RowNumber_Where_RecordPresented_At_DynamicTable {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		
		//Locating table at webpage
		WebElement Table=driver.findElement(By.xpath("//table[contains(@id,'tbl_sector0')]"));
		
		//Finding list of rows available under table
		List<WebElement> Rows=Table.findElements(By.tagName("tr"));
		Rows.remove(0);
		
		
		for (int i = 0; i <Rows.size(); i++) 
		{
			//Target Each row
			WebElement DynamicRow=Rows.get(i);
			//Read text from each dynamic row
			String RowText=DynamicRow.getText();
			
			if(RowText.contains("State Bank of India"))
			{
				System.out.println("Record Presented at Position --> "+(i+1));
			}
			
			
		}


	}

}
