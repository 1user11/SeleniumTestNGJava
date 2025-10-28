package com.websitename.base;

import com.websitename.listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");


//        ChromeOptions options = new ChromeOptions();
//        String chromeOpts = System.getenv("CHROME_OPTIONS");
//        if (chromeOpts != null) {
//            options.addArguments(chromeOpts.split(";"));
//        }


        driver = new ChromeDriver(options);
        driver.get("https://askomdch.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @AfterMethod
    public void tearDown(Method method, ITestResult testResult) {
        if (!testResult.isSuccess()) {
            ProjectUtils.takeScreenshot(driver, testResult.getTestClass().getRealClass().getSimpleName(), testResult.getName());
        }

        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                System.out.println("Error while closing the browser: " + e.getMessage());
            }
        }
    }
}
