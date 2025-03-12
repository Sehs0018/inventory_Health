package PageDef.PageStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;

import java.time.Duration;

public class Pricing_step {

   ChromeDriver driver=Hooks.driver;

    public void selectidp()

        {
            //Launching the Inventory Health

            driver.get("https://inventory-health.noon.partners/en/pricing?project=PRJ9404");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            //Catch the idp element
            WebElement PRJ=driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]"));
            PRJ.click();




        }
        public void pricing_tab()

        {
            driver.get("https://inventory-health.noon.partners/en/pricing?project=PRJ70952");

        }

        public void check_text()
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            String title=driver.findElement(By.xpath("//h3[contains(text(),'Inventory Health')]")).getText();
            System.out.println(title);

            SessionId session=driver.getSessionId();
            System.out.println(session);
        }

}
