import Configuration.CookiePolicy;
import Configuration.DriverUtils;
import Configuration.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCase1 {
    @BeforeMethod
    public void initDriver() {
        DriverUtils.initDriver();
        HomePage homePage = new HomePage();
        homePage.openPage();
        DriverUtils.driver.manage().addCookie(new Cookie("we_experiment_create_page_variant","0"));
        CookiePolicy cookiePolicy = new CookiePolicy();
        cookiePolicy.addCookie();
    }

    @Test
    public void myFirstTest() {
        WebDriverWait wait = new WebDriverWait(DriverUtils.driver, 50);
        WebElement element = DriverUtils.driver.findElement
                (By.cssSelector("[data-test=\"action-button-1-Express-Yourself-by-Adding-Text-to-Photos\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DriverUtils.driver.navigate().back();
        WebElement element2 = DriverUtils.driver.findElement(By.cssSelector("[data-test=\"action-button-2-Why-Text-Editor?\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(element2));
        element2.click();


    }

    @AfterMethod
    public void killDriver() throws InterruptedException {
        DriverUtils.killDriver();
    }
}
