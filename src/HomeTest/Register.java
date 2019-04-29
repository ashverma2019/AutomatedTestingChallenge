package HomeTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Register extends Webpage{

    @Test
    public void Signup() {

        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.id("email_create")).sendKeys("test@testing123.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Robert");
        driver.findElement(By.id("customer_lastname")).sendKeys("Young");
        driver.findElement(By.name("passwd")).sendKeys("qwerty2019");
        driver.findElement(By.id("firstname")).sendKeys("Robert");
        driver.findElement(By.id("lastname")).sendKeys("Young");
        driver.findElement(By.name("address1")).sendKeys("PO BOX 555");
        driver.findElement(By.id("city")).sendKeys("New York");
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("New York");
        driver.findElement(By.id("postcode")).sendKeys("95054");
        new Select(driver.findElement(By.id("id_country"))).selectByVisibleText("United States");
        driver.findElement(By.id("phone_mobile")).sendKeys("0771 626 7783");
        driver.findElement(By.id("alias")).sendKeys("abcd.com");
        driver.findElement(By.id("submitAccount")).click();
    }



}
