package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton extends SetUp{
    @Test
    public void radioButtonTest() throws InterruptedException {
        List<WebElement> radioButtons = driver.findElements(By.xpath("//*[@name='radioButton']"));

        for (int i = 0; i < radioButtons.size() ; i++) {
            if(radioButtons.get(i).getAttribute("value").equalsIgnoreCase("radio3")){
                radioButtons.get(i).click();
            }
        }
        System.out.println("click success");
        Thread.sleep(3000);
    }
}
