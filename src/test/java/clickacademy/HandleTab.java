package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class HandleTab extends SetUp{

    @Test
    public void windowHandle(){
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("#opentab")).click();

        String oldWin = driver.getWindowHandle();
        List<String> newWins = new ArrayList<>(driver.getWindowHandles());
        newWins.remove(oldWin);
        driver.switchTo().window(newWins.get(0));
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[text()='Login']")).click();
    }
}
