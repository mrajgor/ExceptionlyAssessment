package e2e;

import base.BaseTests;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class IonicPartnerTest extends BaseTests {
    private WebDriver driver;

    @Test(priority = 1)
    public void blogPage() {
        //Click on Blog
        ionicPartnersClass.clickBlog();

        //Open Blog page
        ionicPartnersClass.getBlogPage();
        assertEquals(ionicPartnersClass.getBlogPage(),
                "Our Blog",
                "Blog Page does not open");
        System.out.println("Blog Page should be opened successfully");

        //Scrolling down the page till the iconicPartnerFooter is displayed
        ionicPartnersClass.scrollIconicPartnerFooter();
        System.out.println("Iconic Partner Logo should display in footer ");
    }

    @Test(priority = 2)
    public void aboutUsPage() throws InterruptedException {
        //Click on About Us
        ionicPartnersClass.clickAboutUs();

        //Open About Us page
        ionicPartnersClass.getAboutUsPageStatus();
        System.out.println("About Us Page should be opened successfully");

        //Scrolling down the page till the iconicPartnerFooter is displayed
        ionicPartnersClass.scrollIconicPartnerFooter();
        System.out.println("Iconic Partner Logo should display in footer ");

        //Click On Twitter
        ionicPartnersClass.clickTwitter();
        ionicPartnersClass.getTwitterPageStatus();
        System.out.println("Ionic Partners Twitter handle page should be opened successfully");
    }
}

