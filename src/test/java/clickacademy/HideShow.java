package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class HideShow extends SetUp{
    @Test
    public void hideShow(){
        WebElement ele = driver.findElement(By.id("displayed-text"));
        System.out.println(ele.isDisplayed());
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println(ele.isDisplayed());
        driver.findElement(By.id("show-textbox")).click();
        System.out.println(ele.isDisplayed());
    }
}
