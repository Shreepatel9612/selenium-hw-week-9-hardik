package orangehrmtest;

/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Click on the ‘Forgot your password?’ link.
 * 7. Print the current URL.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email in the email field.
 * 11. Enter the password in the password field.
 * 12. Click on the Login Button.
 * 13. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser2 {
    public static void main(String[] args) {
        //set up Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open URL
        String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(baseUrl);

        //Print the title of the page.
        System.out.println("Page Title: " + driver.getTitle());

        //Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("driver.pagesource: " + driver.getPageSource());

        //Click on the ‘Forgot your password?’ link
        WebElement forgatepasswordLink = driver.findElement(By.linkText("Forgot your password?"));
        forgatepasswordLink.click();

        //Print the current URL
        System.out.println("Get Current URL: " + driver.getCurrentUrl());

        //Navigate back to the login page
        driver.navigate().back();

        //Refresh the page
        driver.navigate().refresh();

        //Enter the email in the email field
        WebElement usernameField = driver.findElement(By.className("username"));
        usernameField.sendKeys("Admin");

        //Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("admin123");

        //Click on the Login Button
        WebElement loginButton = driver.findElement(By.id("submit"));
        loginButton.click();

        //Close the browser
        driver.quit();

    }

}
