package e2e;

import base.BaseTests;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import java.awt.*;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class IonicPartnerTest extends BaseTests {
    private WebDriver driver;

    @Test(priority = 1)
    public void blogPage() throws InterruptedException, AWTException {
        sleep(5000);
        ionicPartnersClass.clickBlog();
        sleep(2000);
        ionicPartnersClass.getBlogPage();
        sleep(2000);
        assertEquals(ionicPartnersClass.getBlogPage(),
                "Our Blog",
                "Blog Page does not open");
        System.out.println("Blog Page should be opened successfully");
        sleep(2000);

        // Scrolling down the page till the iconicPartnerFooter is displayed
        ionicPartnersClass.scrollIconicPartnerFooter();
        System.out.println("Iconic Partner Logo should display in footer ");
        sleep(2000);
    }

    @Test(priority = 2)
    public void aboutUsPage() throws InterruptedException {
        ionicPartnersClass.clickAboutUs();
        sleep(2000);
        ionicPartnersClass.getAboutUsPageStatus();
        sleep(2000);
        System.out.println("About Us Page should be opened successfully");

        // Scrolling down the page till the iconicPartnerFooter is displayed
        ionicPartnersClass.scrollIconicPartnerFooter();
        System.out.println("Iconic Partner Logo should display in footer ");
        sleep(5000);

        //Click On Twitter
        ionicPartnersClass.clickTwitter();
        sleep(2000);
        ionicPartnersClass.getTwitterPageStatus();
        sleep(2000);
        System.out.println("Ionic Partners Twitter handle page should be opened successfully");
    }
}

