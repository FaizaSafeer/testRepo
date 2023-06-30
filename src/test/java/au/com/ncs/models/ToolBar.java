package au.com.ncs.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolBar {
    private WebDriver driver;

    public ToolBar(WebDriver driver) {
        this.driver = driver;
    }


    public    void signLoginBtn() {
        driver.findElement(By.cssSelector("a[aria-label='login or signup']")).click();
    }
    public    void MenuBtn() {
        driver.findElement(By.cssSelector("a[aria-label='menu']")).click();
    }
}
