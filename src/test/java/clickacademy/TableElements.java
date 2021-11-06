package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class TableElements extends SetUp{
    @Test
    public void tableEle(){
        System.out.println(driver.findElement(By.cssSelector("*[name='courses'] tr td ")).getText());
        System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3) td:nth-child(2)")).getText());
    }
}
