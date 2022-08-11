package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver","./library/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/?stype=lo&jlou=AfcpmOY3RGLTVX7NhisVW_OEQppKpOcV2M0L2ozYfWZAveaUtQC7gpgN4CKJJpZXSTbKdsDG3O7eHSVYjNblfDs5_bjK6kxkdSICjd0HN420HA&smuh=62425&lh=Ac-9sSGI8ryGJXRx");
	 

	}

}
