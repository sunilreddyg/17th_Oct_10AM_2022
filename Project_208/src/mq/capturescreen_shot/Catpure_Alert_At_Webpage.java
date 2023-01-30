package capturescreen_shot;


import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Catpure_Alert_At_Webpage 
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.naukri.com");
	    driver.manage().window().maximize();
	    
	    
	    
	    Robot robot=new Robot();
	    robot.setAutoDelay(1000);
	    
	    //Create image at runtime
	    BufferedImage image=robot.createScreenCapture
	    		(new Rectangle(new Dimension(800, 600)));
	    
	    //Writing image into local folder
	    ImageIO.write(image, "PNG", new File("D:\\grid\\Alert.png"));
	    
	    
	    
	    /*
	     * This Program userfull to capture screen
	     * 	at window interface or alerts at webpages
	     */

	}

}
