package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class CheckBox extends SetUp{
    @Test
    public void radioButtonTest() throws InterruptedException {
        List<WebElement> radioButtons = driver.findElements(By.xpath("//*[contains(@id,'checkBoxOption')]"));

        for (int i = 0; i < radioButtons.size() ; i++) {
            if(radioButtons.get(i).getAttribute("value").equalsIgnoreCase("option1")){
                radioButtons.get(i).click();
            }
        }
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
        System.out.println("click success");
        Thread.sleep(3000);
    }
}
