package au.com.ncs.models;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MemberlogIn {
    private WebDriver driver;

    public MemberlogIn(WebDriver driver) {
        this.driver = driver;
    }
    public void signUpBtn(){

driver.findElement(By.linkText("Sign Up")).click();

}
public void notMember() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[aria-label='signup']"))).click();

}


    public void userNameError(){
        String usernameErrorMsg = driver.findElement(By.id("username-err")).getText();
        Assertions.assertEquals("Username is required", usernameErrorMsg);
    }

    public void passwordError(){
        String passwordErrorMsg = driver.findElement(By.id("password-err")).getText();
        Assertions.assertEquals("Password is required",passwordErrorMsg);
    }
    public void confirmPassError(){
        String confirmPassMsg = driver.findElement(By.id("confirm-err")).getText();
        Assertions.assertEquals("Please confirm your password", confirmPassMsg);
    }

}
