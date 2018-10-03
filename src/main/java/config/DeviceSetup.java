package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class DeviceSetup extends BaseTest {


   static AppiumDriver prepareDevice() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");;
        capabilities.setCapability("deviceName", "Samsung Galaxy note");
        capabilities.setCapability("version", "6.0.1");
        capabilities.setCapability("udid","52033ce659c4b3d7");
        capabilities.setCapability("appPackage", "com.primephonic.app");
        capabilities.setCapability("appActivity","com.primephonic.app.features.launcherscreen.ui.LauncherActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
   }
}
