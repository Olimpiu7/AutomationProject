package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.homepage.HomePage;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();

    @BeforeSuite
    public void init(){
        pages.BasePage.setUp();

    }

    @AfterSuite
    public void teardown(){
        pages.BasePage.tearDown();
    }
}
