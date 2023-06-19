package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) throws InterruptedException {
        //Setup Firefox browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // Launch the Firefox Browser
        WebDriver driver = new FirefoxDriver();
        //open The URL into the Browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // Print the title of the page
        System.out.println("Page Title is : " + driver.getTitle());
        //Print the current url
        System.out.println("Current URl is : " + driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page Source is : " + driver.getPageSource());
        Thread.sleep(1000);
        // Find and Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("Admin");
        // find and Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Close the Browser
        driver.close();
    }
}
