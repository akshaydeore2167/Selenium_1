package _2_Parellel_Testing;

import Start_Browser.Start_Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class _2_Parellel {
    WebDriver driver;

    @Test(priority = 1, dataProvider = "leet",dataProviderClass = _3_DataProvider.class,groups = {"Sanity"})
    public void Login_3(String Email, String Pwd) throws MalformedURLException, InterruptedException {
        Start_Browser browser=new Start_Browser();
        this.driver=browser.Browser();
        driver.navigate().to("https://leetcode.com/problemset/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/a[@id='navbar_sign_in_button' and contains(text(),'Sign in')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("id_login")).click();
        driver.findElement(By.id("id_login")).sendKeys(Email);
        driver.findElement(By.id("id_password")).click();
        driver.findElement(By.id("id_password")).sendKeys(Pwd);
        driver.findElement(By.xpath("//div/span[contains(text(),'Sign In')]")).click();


    }
}
