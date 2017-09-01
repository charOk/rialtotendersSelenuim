package ua.com.rialtotenders.tests.smoke;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.rialtotenders.pageObject.AboutPage;
import ua.com.rialtotenders.pageObject.HeaderPage;
import ua.com.rialtotenders.tests.BaseTest;

/**
 * Created by Alexander.
 */
public class HeaderExpressTest extends BaseTest {
    private HeaderPage headerPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void clickLogoTest() {
        getDriver().get("https://rialtotenders.com.ua/about");

        headerPage = new HeaderPage(getDriver());
        headerPage.clickLogo();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/"));
    }

    @Test
    public void openAboutPageTest() {
        String header = "Про систему";

        headerPage = new HeaderPage(getDriver());
        headerPage.clickAbout();


        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/about"));

        AboutPage aboutPage = new AboutPage(getDriver());
        Assert.assertTrue("Header " + header + " is not matched",aboutPage.isTitleEqual(header));
        //ASSERT!!!!

    }

}
