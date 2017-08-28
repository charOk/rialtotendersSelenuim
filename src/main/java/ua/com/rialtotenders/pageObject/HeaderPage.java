package ua.com.rialtotenders.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alexander.
 */
public class HeaderPage extends BasePage{

    @FindBy(css = (".c-header__logo"))
    private WebElement logo;

    @FindBy(css = ("a[href='/aboutLink']"))
    private WebElement aboutLink;


    public HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public void clickLogo() {
        clickTo(logo);
    }


    public void clickAbout() {
        clickTo(aboutLink);
    }

    public void fillLogo(String text) {
        fill(logo, text);
    }
}
