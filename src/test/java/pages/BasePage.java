package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver, String url) {
        PageFactory.initElements(driver, this);

        this.driver = driver;
        driver.get(url);
    }
}
