package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MVNrepositoryHomePage {

    public MVNrepositoryHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
