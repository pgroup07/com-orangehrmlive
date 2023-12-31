package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        //Setup Chrome browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //open The URL into the Browser
        driver.get(baseUrl);
        //Maximise the Browser
        driver.manage().window().maximize();

        // Print the title of the page
        //String title=driver.getTitle();
        System.out.println("Page Title is : " + driver.getTitle());
        //Print the current url
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source is: " + driver.getPageSource());
        Thread.sleep(1000);

        // Find and Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("Admin");

        // find and Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Close the Browser
        driver.close();

    }

}
