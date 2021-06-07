package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import ionic.IonicPartnersClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {
    private WebDriver driver;
    protected IonicPartnersClass ionicPartnersClass;

    @BeforeClass
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ionicpartners.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        ionicPartnersClass = new IonicPartnersClass(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
