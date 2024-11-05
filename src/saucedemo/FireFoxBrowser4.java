package saucedemo;


/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser4 {
    public static void main(String[] args) {
        //Set up Chrome browser
        WebDriver driver = new FirefoxDriver();

        // Open URL
        String baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        //Print the current URL
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("driver.pagesource: " + driver.getPageSource());

        //Enter the email in the email field
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        //Enter the password in the password field.
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        //Click on the Login Button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Print the current URL
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //Refresh the page
        driver.navigate().refresh();

        //Close the browser
       driver.quit();

    }
}
