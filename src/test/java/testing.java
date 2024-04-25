import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testing {
@Test
    public void testLoginAndOperation() throws InterruptedException {
        // Set path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\backend\\SeleniumTesting\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); // Run Chrome in headless mode (without GUI)

        WebDriver driver = new ChromeDriver();


        // Initialize WebDriver
        // Initialize WebDriver
//        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Maximize browser window
        driver.manage().window().maximize();

        // Set implicit wait time

        // Open the login page
        driver.get("http://localhost:3000/");
//
        // Find username and password fields and login button
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.isDisplayed();
        usernameField.isEnabled();
        usernameField.sendKeys("admin");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.isDisplayed();
        passwordField.isEnabled();
        passwordField.sendKeys("password");

//        WebElement login = driver.findElement(By.id("loginButton"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement login=driver.findElement(By.id("login-Button"));
        login.isDisplayed();
        login.isEnabled();
        Thread.sleep(2000);
        login.click();

        //Operation on buttons
        WebElement b1=driver.findElement(By.id("numButton-9"));
        WebElement b2=driver.findElement(By.id("operaButton-Addition"));
        WebElement b3=driver.findElement(By.id("numButton-2"));
         b1.click();
        Thread.sleep(1000);
         b2.click();
        Thread.sleep(1000);
         b3.click();
        Thread.sleep(1000);

        WebElement equal=driver.findElement(By.id("operaButton-Result"));
        equal.click();
        Thread.sleep(1000);

        String expectedUrl= driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        WebElement logout=driver.findElement(By.id("logoutButton"));
        logout.isDisplayed();
        logout.isEnabled();
        Thread.sleep(2000);
        logout.click();

    }
}
