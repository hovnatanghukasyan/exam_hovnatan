package Configuration;

public class HomePage extends BasePage{
    @Override
    public void openPage() {
        DriverUtils.driver.get(Config.ENVIRONMENT);
    }
}