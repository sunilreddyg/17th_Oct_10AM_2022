package browser_options.chrome;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Merging_DesiredCapabilities_With_ChromeOptions {

	public static void main(String[] args) {
		
		
		
		//Old method to set Capabilities for chrome browser
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN7);
		caps.setJavascriptEnabled(true);
		
		ChromeOptions options=new ChromeOptions();
		options.setBrowserVersion("103");
		options.merge(caps);
		//Merging all Desiredcapabilities with chrome options
	}

}
