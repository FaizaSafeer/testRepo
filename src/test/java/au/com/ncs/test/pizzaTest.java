package au.com.ncs.test;


//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;

import au.com.ncs.models.MemberlogIn;
import au.com.ncs.models.ToolBar;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class pizzaTest {


    static WebDriver driver;

    public static WebDriver getDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }

    @BeforeEach
    public void setUp() {
        driver = getDriver();
        driver.get("https://d3ovkzfkbrwp1z.cloudfront.net/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void LoginTest() {
        ToolBar toolbar = new ToolBar(driver);
        toolbar.signLoginBtn();

        MemberlogIn mb = new MemberlogIn(driver);
        mb.signUpBtn();
        mb.notMember();
        mb.userNameError();
        mb.passwordError();


    }

    // driver.findElement(By.id("#input-91")).sendKeys("abc");
    @Test
    public void MenuTest() {
        ToolBar toolBar = new ToolBar(driver);
        toolBar.MenuBtn();


      List<WebElement> allTabs=driver.findElements(By.cssSelector("div[role='tab'"));
        for (WebElement oneTab:allTabs) {
            String oneTabValue = oneTab.getText();
            if(oneTabValue.equalsIgnoreCase("Menu"))
                oneTab.click();
        }




        //click on menu
        //take list of all the Sides menu
        //model it like sides and sides page ...in sides page 1)make method of all sides by making list of all menu ....
       // second method to get one menu

       // in other class will make eachMenu ...
      //  then methods that getprice and get calories




    }
}




