package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PIIT_NYA on 11/6/2021.
 */
public class HandleWindow extends SetUp{

    @Test
    public void windowHandle(){
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("#openwindow")).click();

        String oldWin = driver.getWindowHandle();
        List<String> newWins = new ArrayList<>(driver.getWindowHandles());

        Iterator<String> it = newWins.iterator();
        while (it.hasNext()){
            String parent = it.next();
            String newwin = it.next();
            driver.switchTo().window(newwin);
            //perform actions on new window
            driver.close();
            driver.switchTo().window(parent);
        }
        driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[3]/a")).click();

    }

}
