package pages;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

/**
 * Created by Supreet Singh on 22.08.2018.
 */
public class HomeScreen extends Util {
    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    private By plannen = By.id("nl.ns.android.activity:id/plannen");
    private By addWidget = By.id("nl.ns.android.activity:id/addCard");

    @Step("Tab on PlannenTab")
    public void plannen() throws InterruptedException {
        click(plannen);
    }

}
