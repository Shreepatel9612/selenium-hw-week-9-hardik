package comtricentis;

/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demowebshop.tricentis.com/login ”
 * 7. Print the current URL.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current URL.
 * 11. Refresh the page.
 * 12. Enter the email in the email field.
 * 13. Enter the password in the password field.
 * 14. Click on the Login Button.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser1 {
    public static void main(String[] args) {
        // set up Chrome browser
        WebDriver driver = new ChromeDriver();

        // open Url
        String baseUrl = "https://demowebshop.tricentis.com/";
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        //Print the Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("driver,pagesource: " + driver.getPageSource());

        //Navigate to URL
        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.get(loginUrl);

        //Print the current URL
        System.out.println("Get Current URL: " + driver.getCurrentUrl());

        // Navigate back to the home page
        driver.navigate().back();

        //Navigate to the Login page
        driver.navigate().forward();

        //Print the current URL
        System.out.println("Get Current URL: " + driver.getCurrentUrl());

        //Refresh the Page
        driver.navigate().refresh();

        //Enter the email in the email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("shreepatel9612@gmail.com");

        //Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Shree123");

        //Click on the login button
        WebElement loginButton = driver.findElement(By.className("login-button"));
        loginButton.click();


        //close the browser
        driver.quit();







    }


}
