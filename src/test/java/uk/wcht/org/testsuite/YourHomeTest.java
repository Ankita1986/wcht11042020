package uk.wcht.org.testsuite;

import org.testng.annotations.Test;
import uk.wcht.org.pages.HomePage;
import uk.wcht.org.testbase.TestBase;

/**
 * Created by Ankita
 */
public class YourHomeTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test(groups = {"smoke", "sanity"})
    public void verifyUserShouldNavigateToYourHomePage(){
        homePage.clickOnYourHomeLink();

    }
    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToAboutUsPage(){
        homePage.clickOnAboutUsLink();
    }
}
