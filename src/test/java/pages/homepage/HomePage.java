package pages.homepage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;

    private By logo = By.id("logo");

    private HomePage(){

    }

    public static HomePage getInstance(){
        if (instance== null){
            instance = new HomePage();

        }
        return instance;
    }

    public  boolean checkLogo(){
        LOG.info("check if Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

}
