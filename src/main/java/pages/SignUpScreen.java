package pages;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

/**
 * Created by Supreet Singh on 22.08.2018.
 */
public class SignUpScreen extends Util {
    public SignUpScreen(AppiumDriver driver) {
        super(driver);
    }

    private By vertrektijden  = By.id("nl.ns.android.activity:id/vertrektijden");


    @Step("Open Vertrektijden Tab")
    public void openVertrektijdenTab() throws InterruptedException {
        click(vertrektijden);
    }


}
