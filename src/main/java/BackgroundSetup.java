import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BackgroundSetup {

    WebDriver driver = new FirefoxDriver();
    public BackgroundSetup(String TestLink){
        System.out.println("Driver Opened");
        driver.get(TestLink);
    }

}
