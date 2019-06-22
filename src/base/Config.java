package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.WedFunction;

	public class Config extends WedFunction {
	@Parameters({"url","Browser"})
	@BeforeMethod
	public  void browserInitialize(String url, String browsername){
	
	//System.setProperty("webdriver.chorome.driver", "C://Users//shahadat//workspace//ExpediaMdFramework//DRIVER//chromedriver.exe");
	//we can use same like that
	System.setProperty("webdriver.chorome.driver",System.getProperty("user.dir")+"//ExpediaMdFramework//DRIVER//chromedriver.exe");
	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	System.out.println("testing successful");
	
	//driver.close();
}
	@AfterMethod
	public void afterTest (){
        //System.out.println("Close the browser");
		// instead of S. o.p in log4j we can use application
		applicationLog.info("Close the browser");
		driver.close();
	}


}
	