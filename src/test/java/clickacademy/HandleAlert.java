package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class HandleAlert extends SetUp{
    @Test
    public void handleAlert(){
        driver.findElement(By.id("name")).sendKeys("nassim");
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        waitFor(3);
        driver.switchTo().alert().accept();
        waitFor(3);

        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        waitFor(3);
        driver.switchTo().alert().dismiss();
        waitFor(3);
    }
}
