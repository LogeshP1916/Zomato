package Com.Zomato_GenericUtility;

public interface FrameWorkConstants {

	JavaUtility jUtil = new JavaUtility();

	static final String propertyFilePath = "./src/test/resources/testData/zomato.properties";
	
	static final String excelFilePath= "/Zomato/src/test/resources/testData/zomato.xlsx";

	static final String screenshotPath = "./screenshots/" + jUtil.localDateAndTime() + ".png";

	static final String reportsPath = "./reports/" + jUtil.localDateAndTime() + ".html";

}
