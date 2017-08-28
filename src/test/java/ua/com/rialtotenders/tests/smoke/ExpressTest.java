package ua.com.rialtotenders.tests.smoke;

import org.junit.Assert;
import org.junit.Test;
import ua.com.rialtotenders.pageObject.HeaderPage;
import ua.com.rialtotenders.tests.BaseTest;

/**
 * Created by Alexander.
 */
public class ExpressTest extends BaseTest {
    private HeaderPage headerPage;

    @Test
    public void clickLogoTest() {
        getDriver().get("https://rialtotenders.com.ua/");

        headerPage = new HeaderPage(getDriver());
        /////////////////
        headerPage.clickLogo();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/"));
    }
}
