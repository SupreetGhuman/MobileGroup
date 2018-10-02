package pages;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

/**
 * Created by Supreet Singh on 22.08.2018.
 */
public class SplashScreen extends Util {
    public SplashScreen(AppiumDriver driver) {
        super(driver);
    }

    private By overslaanButton = By.id("nl.ns.android.activity:id/primaryAction");
    private By startButton = By.id("nl.ns.android.activity:id/start");

    @Step("splashscreen overslaan")
    public void skipSplashScreen ()  {
        waitAndClick(overslaanButton);
    }

    @Step("Click startbutton in the splashscreen ")
    public void startButton ()  {
        waitAndClick(startButton);
    }


}