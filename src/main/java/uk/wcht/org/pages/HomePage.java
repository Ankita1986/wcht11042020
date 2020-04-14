package uk.wcht.org.pages;

import org.openqa.selenium.By;
import uk.wcht.org.utility.Utility;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {
    By yourHomeLink = By.linkText("Your home");
    By aboutUsLink = By.linkText("About us");

    public void clickOnYourHomeLink(){

        clickOnElement(yourHomeLink);
    }
    public void clickOnAboutUsLink(){
        clickOnElement(aboutUsLink);
    }


}
