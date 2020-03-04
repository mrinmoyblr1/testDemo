package testDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunchDemo {
	 
    public static void main(String[] args) {
         
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
         
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "D:\\Mrinmoy Biswas\\Study\\Tools\\chromedriver.exe");
     
        //Instantiating driver object
        driver = new ChromeDriver();
        driver.manage().window().maximize();
         
        //Using get() method to open a webpage
        driver.get("http://google.com");
         
        //Closing the browser
        driver.quit();
  
    }
  
}