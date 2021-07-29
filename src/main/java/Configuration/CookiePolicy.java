package Configuration;

import org.openqa.selenium.Cookie;

public class CookiePolicy {
    public void addCookie(){
        DriverUtils.driver.manage().addCookie(new Cookie("user_key", "b6409bcb-3cc8-4644-9eb4-897da417ca2d"));
        DriverUtils.driver.manage().addCookie(new Cookie("we-editor-first-open", "true"));
        DriverUtils.driver.manage().addCookie(new Cookie("OptanonAlertBoxClosed", "2021-06-26T13:47:26.654Z"));
        DriverUtils.driver.manage().addCookie(new Cookie("we-editor-photo-first-open", "true"));
        DriverUtils.driver.navigate().refresh();
    }

}
