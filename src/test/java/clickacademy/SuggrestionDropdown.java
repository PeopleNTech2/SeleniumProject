package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class SuggrestionDropdown extends SetUp{
    @Test
    public void suggestionDropdown(){
        WebElement dd = driver.findElement(By.cssSelector("#autocomplete"));
        dd.click();
        dd.sendKeys("can", Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        waitFor(5);
    }
    @Test
    public void suggestionDropdown2(){
        WebElement dd = driver.findElement(By.cssSelector("#autocomplete"));
        Actions action = new Actions(driver);
        action.moveToElement(dd).click().sendKeys("can",Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        waitFor(5);
    }
}
