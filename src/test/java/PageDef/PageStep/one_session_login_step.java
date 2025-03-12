package PageDef.PageStep;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class one_session_login_step
{

    ChromeDriver driver=Hooks.driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void lunchbroswer()
    {
        driver.get("https://inventory-health.noon.partners/en/pricing?utm_source=health-and-performance&project=PRJ9404");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void login()
    {
       WebElement Email_field= driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
       Email_field.sendKeys("hezzat@noon.com");
       //Click next
       driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();

       //Wait till page's loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]")).click();
       // wait till page's loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement verification_email=driver.findElement(By.xpath("/html[1]/body[1]"));
        verification_email.sendKeys("hezzat@noon.com");

        //Click next
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();

        // wait till page's loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Password_field

        WebElement Password=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        Password.sendKeys("HassanP@ssw0rd018");

        //Clicking next
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
        // wait till page's loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



    }

    public void select_IDP()
    {

        js.executeScript("window.scrollBy(0,250)");
        WebElement IDP=driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]"));
        IDP.click();
        // wait till page's loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

}
