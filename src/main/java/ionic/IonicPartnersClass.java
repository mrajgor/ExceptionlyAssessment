package ionic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class IonicPartnersClass {
    private WebDriver driver;
    private By blog = By.xpath("//*[@id='slider-11-slide-47-layer-30']");
    private By statusBlogPage = By.xpath("//*[@id='header']/div/div[3]/div/div/div/h5");
    private By iconicPartnerFooter = By.xpath("//*[@id='footer']/div");
    private By about = By.xpath("//*[@id='header']/div/div[1]/div/div/div[2]/ul/li[1]/a");
    private By statusAboutUsPage = By.xpath("//*[@id='content']/div[1]/div/div/div[1]/div/h5");
    private By twitter = By.xpath("//*[@id='footer']/div/div/div/div[2]/div[2]/a[1]/i");
    private By statusTwitterPage = By.xpath("//*[@id='react-root']/div/div/div[2]/main/div/div/div/div[1]/div/div[1]/div[1]/div/div/div/div/div[2]/div/h2/div/div/div/span[1]/span/span");

    public IonicPartnersClass(WebDriver driver) {
        this.driver = driver;
    }

    public IonicPartnersClass() {
    }

    public IonicPartnersClass clickBlog () {
        driver.findElement(blog).click();
        return new IonicPartnersClass(driver);
    }

    public String getBlogPage () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver.findElement(statusBlogPage).getText();
    }

    public IonicPartnersClass scrollIconicPartnerFooter () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(iconicPartnerFooter).isDisplayed();
        return new IonicPartnersClass(driver);
    }

    public IonicPartnersClass clickAboutUs () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(about).click();
        return new IonicPartnersClass(driver);
    }

    public IonicPartnersClass getAboutUsPageStatus () {
        driver.findElement(statusAboutUsPage).getText();
        return new IonicPartnersClass(driver);
    }

    public IonicPartnersClass clickTwitter () {
        WebDriverWait waitElement = new WebDriverWait(driver,10);
        waitElement.until(ExpectedConditions.elementToBeClickable(twitter)).click();
        return new IonicPartnersClass(driver);
    }

    public IonicPartnersClass getTwitterPageStatus () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(statusTwitterPage).getText();
        return new IonicPartnersClass(driver);
    }
}
