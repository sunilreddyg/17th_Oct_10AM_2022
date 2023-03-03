package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_Extent_Report {

	public static void main(String[] args) {
		
		//Create Html file at Selected Location
		String path="D:\\06_Dec_2022_10-30AM\\Project_208\\Reports\\Report.html";
		ExtentReports reporter=new ExtentReports(path, true);
		
		
		//Save and Flush Data to File
		reporter.flush();

	}

}
