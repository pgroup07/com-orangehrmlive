package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    //Changing the Browser name and use it.

    static String browser = "Edge";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        //Print the title of the page
        System.out.println("Page Title is : " + driver.getTitle());
        //Print the current url
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page Source is : " + driver.getPageSource());
        Thread.sleep(1000);
        // Find and Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        // find and Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Close the Browser
        driver.close();
    }
}
