package HomeTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Webpage {

    WebDriver driver;


    @Before
    public void Home() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Desktop\\New folder\\jar files\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void Finish() {
        //driver.quit();
    }

}
