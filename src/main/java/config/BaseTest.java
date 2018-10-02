package config;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

/**
 * Created by Supreet Singh on 22.08.2018.
 */
public class BaseTest {


    public static AppiumDriver driver;
    protected WebDriverWait wait;


    @BeforeSuite()
    public void setUp() throws MalformedURLException, InterruptedException, FileNotFoundException {
        DeviceSetup.prepareDevice();
        wait = new WebDriverWait(driver,15);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
