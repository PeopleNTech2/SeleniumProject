package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class StaticDropdown extends SetUp{

    @Test
    public void staticDropdown(){
        WebElement dd = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));

        Select select = new Select(dd);

        select.selectByValue("option1");
        waitFor(3);
    }

}
