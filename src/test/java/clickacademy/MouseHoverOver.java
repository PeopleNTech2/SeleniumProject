package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class MouseHoverOver extends SetUp{
    @Test
    public void mouseHoverOver(){
        WebElement button = driver.findElement(By.cssSelector("#mousehover"));
        Actions ac = new Actions(driver);
        ac.moveToElement(button).build().perform();
        WebElement top = driver.findElement(By.linkText("Top"));
        top.click();
        waitFor(3);
    }
}
