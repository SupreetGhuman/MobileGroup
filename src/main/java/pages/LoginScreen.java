package pages;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

/**
 * Created by Supreet Singh on 22.08.2018.
 */
public class LoginScreen extends Util {
    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }


  //  private By StoringenTab = By.id("nl.ns.android.activity:id/storingen");
    private By StoringenTab = By.id("com.primephonic.app:id/login_button");



    @Step("Open Storingen Tab")
    public void tabStoringenTab() throws InterruptedException {
        click(StoringenTab);
        Thread.sleep(5000);
    }
}
