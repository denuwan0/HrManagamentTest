package com.hrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try{
			prop = new Properties();
			//FileInputStream ip = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\HrManagamentTest\\"
			//		+"src\\main\\java\\com\\hrm\\qa\\config\\config.properties");

			FileInputStream ip = new FileInputStream("C:\\Users\\17534\\eclipse-workspace\\HrManagamentTest\\src"
					+ "\\main\\java\\com\\hrm\\qa\\config\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}

	}


	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			//System.setProperty("webdriver.chrome.driver",
			//		"C:\\Users\\Lenovo\\eclipse-workspace\\HrManagamentTest\\chromedriver.exe");

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\17534\\eclipse-workspace\\HrManagamentTest\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}
