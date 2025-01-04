package Start_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.DesiredCapabilities.*;

@Test
public class Start_Browser {
    WebDriver driver;
    public WebDriver Browser() throws MalformedURLException {
        //By Using Chrome Driver
//        System.setProperty("webdriver.chrome.driver","D:/chromedriver-win64/chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.navigate().to("https://github.com/");
//        driver.manage().window().maximize();
        //By Using Docker and grid
        DesiredCapabilities dc=DesiredCapabilities.chrome();
        URL url=new URL("http://localhost:4444");
        driver=new RemoteWebDriver(url,dc);
        return driver;


    }
//    public WebDriver
//    BasePage(WebDriver driver) {
//        this.driver = driver;
//        return driver;
//    }

    @AfterClass
    public void treadown(){
        driver.quit();
    }
}
