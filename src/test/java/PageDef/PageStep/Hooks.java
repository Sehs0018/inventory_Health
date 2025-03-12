package PageDef.PageStep;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    public static ChromeDriver driver;

    /**
     *
     * So this function mainly focus on bringing the session path from before launching the browswer
     * */
    @Before
    public void Open_broswer()
    {

        ChromeOptions option = new ChromeOptions();
        String profile = "C:\\Users\\hezzat\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1";
        option.addArguments("user-data-dir=" + profile);
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(option);
        driver.manage().window().maximize();



    }

    @After

    public void Close_broswer()

    {
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.manage().deleteAllCookies();
     driver.quit();

    }
}
