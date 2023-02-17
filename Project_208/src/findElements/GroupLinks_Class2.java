package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupLinks_Class2 {

	public static void main(String[] args) throws Exception 
	{
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		new Select(driver.findElement(By.id("searchDropdownBox")))
		.selectByVisibleText("Books");
		
		
		WebElement SearcBtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearcBtn.click();
		
		
		WebElement BooksLocation=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[2]"));		
		List<WebElement> AllBooks=BooksLocation.findElements(By.tagName("a"));
		
		if(AllBooks.size() > 0)
		{
			System.out.println("Found List of Book and count is --> "+AllBooks.size());
			
			for (int i = 0; i < AllBooks.size(); i++) 
			{
				//Get Each book using index number
				WebElement EachBook=AllBooks.get(i);
				
				//Read Linktext
				String LinkName=EachBook.getText();

				
				EachBook.click();
				Thread.sleep(2000);
				
				System.out.println(LinkName+" Title Presented ---> "+driver.getTitle());
				driver.navigate().back();
				Thread.sleep(2000);
				
				//Restoring page reference to avoid staleelementreference exception
				BooksLocation=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[2]"));		
				AllBooks=BooksLocation.findElements(By.tagName("a"));
				
			}
		}
		else
		{
			System.out.println("No books FOund");
		}
		
		
		

	}

}
