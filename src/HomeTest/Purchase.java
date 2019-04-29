package HomeTest;

import org.junit.Test;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertEquals;

public class Purchase extends Register {

    @Test
    public void Cart() {
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
        String expStr="Faded Short Sleeve T-shirts";
        String actStr=driver.findElement(By.id("layer_cart_product_title")).getText();
        assertEquals(actStr,expStr);
    }
}
