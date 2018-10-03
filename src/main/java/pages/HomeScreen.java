package pages;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import page.objects.HomeScreenPageObjects;

/**
 * Created by Supreet Singh on 22.08.2018.
 */
public class HomeScreen extends Util {
    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    HomeScreenPageObjects homeScreenPageObjects = new HomeScreenPageObjects();

    @Step("Tab on PlannenTab")
    public void plannen() throws InterruptedException {
        click(homeScreenPageObjects.plannen);
    }

}
