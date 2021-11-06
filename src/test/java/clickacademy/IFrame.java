package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class IFrame extends SetUp{
    @Test
    public void iFrameHandle(){
        driver.switchTo().frame("iframe-name");
        System.out.println("switched to frame");

        driver.findElement(By.xpath("//*[text()='Register']/../following-sibling::div/a")).click();
        waitFor(5);
    }
}
