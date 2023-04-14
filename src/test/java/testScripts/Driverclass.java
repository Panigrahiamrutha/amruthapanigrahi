package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



import Pages.LandinPage;
import Pages.PlaceOrderPage;
import Pages.checkoutPage;
import Pages.itemsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Driverclass {
	protected static WebDriver driver;

	protected static DesiredCapabilities cap;
	protected static LandinPage landingPage;
	protected static itemsPage items;
	protected static PlaceOrderPage placeOrder;
	protected static checkoutPage checkOut;

	@Before

	public static void init() throws MalformedURLException {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

           DesiredCapabilities cap = new DesiredCapabilities();
           cap.setBrowserName("chrome");

           URL URL = new URL("http://192.168.0.167:4444/wd/hub");

           WebDriver driver = new RemoteWebDriver(URL, cap);

           //implicit wait

           driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

           //application launch

           driver.get("https://www.swiggy.com");

           // getTitle() to obtain page title

           System.out.println("Page title is : " + driver.getTitle());
           
           landingPage = new LandinPage(driver);
   		items = new itemsPage(driver);
   		placeOrder = new PlaceOrderPage(driver);
   		checkOut = new checkoutPage(driver);
	}
   		
           
	
	
	@After
	public void quit() {
		

           driver.close();

   }

	public static Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
        
 }
	


