package uk.wcht.org.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.wcht.org.basepage.BasePage;
import uk.wcht.org.browserselector.BrowserSelector;
import uk.wcht.org.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ankita
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
   // String baseUrl = "https://www.wcht.org.uk//";
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");

    @BeforeMethod(groups = {"smoke", "sanity", "regression"})
    public void openBrowser() {

        browserSelector.selectorBrowser(browser);
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"smoke", "sanity", "regression"})
    public void tearDown() {
        driver.quit();

    }

}
