package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_PO {
    protected WebDriver driver;

    public Base_PO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
