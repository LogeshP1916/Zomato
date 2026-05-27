package Com.Zomato_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.Zomato.POM.Address;
import Com.Zomato.POM.Login_page;

public class BaseTest {

	public WebDriver driver;
	public static WebDriver sDriver;
	public FileUtility fileUtility = new FileUtility();
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public WebDriverUtility webDriverUtility = new WebDriverUtility();
	public Login_page login;
	public Address address;
	
	
	

	@BeforeSuite
	public void bs() {
		System.out.println("@BeforeSuite   DataBase Connected");
	}

	@BeforeTest
	public void bt() {
		System.out.println("@BeforeTest     Reportes Started");
		spark = new ExtentSparkReporter(FrameWorkConstants.reportsPath);
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test = reports.createTest("Address Module");
	}

	@BeforeClass
	public void bc() throws IOException {
		System.out.println("@BeforeClass    Browser Launched");

		String browser = fileUtility.readDataFromPropertyFile("browserName");
		String url = fileUtility.readDataFromPropertyFile("baseUrl");

//		String browser = System.getProperty("browserName");
//		String url = System.getProperty("baseUrl");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Enter valid Browser Name");
		}

		sDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);

	}

	@AfterClass
	public void ac() throws InterruptedException {
		System.out.println("@AfterClass    Browser Closed");

		Thread.sleep(3000);
		driver.quit();
	}

	@AfterTest
	public void at() {
		System.out.println("@AfterTest    Reports Ended");
		reports.flush();
	}

	@AfterSuite
	public void as() {
		System.out.println("@AfterSuite    DataBase Disconnected");
	}

}
