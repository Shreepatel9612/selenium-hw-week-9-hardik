package herokuapp;

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
 * 10. Refresh the page.
 * 11. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser3 {
    static String browser = "Chrome";
    static String baseUrl = "https://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase( "Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase( "Firefox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }


        //Open URL
        String baseUrl = "https://the-internet.herokuapp.com/login";
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("Page Title: (" + browser + "): " + driver.getTitle());

        //Print the current URL
        System.out.println("Current URL: (" + browser + "): " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page Source (" + browser + "): " + driver.getPageSource());

        //Enter the email in the email field
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");

        //Enter the password in the password field.
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //Click on the Login Button.
        WebElement loginButton = driver.findElement(By.className("fa-sign-in"));
        loginButton.click();

        //Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //Close the browser
        driver.quit();



    }
}
