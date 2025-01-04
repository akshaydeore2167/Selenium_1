package _2_Parellel_Testing;

import Start_Browser.Start_Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class _1_Parellel {
    WebDriver driver;

    @Test(priority = 1, dataProvider = "Git",dataProviderClass = _3_DataProvider.class,groups = {"Sanity"})
    public void Login_1 (String Email,String Pwd) throws MalformedURLException, InterruptedException {
        Start_Browser browser=new Start_Browser();
        this.driver=browser.Browser();
        driver.navigate().to("https://github.com/");
        driver.findElement(By.xpath("(//div/a[contains(text(),'Sign in')])[2]")).click();
        driver.findElement(By.xpath("//input[@id='login_field']")).click();
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(Email);
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(Pwd);
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();


    }
//    @Test(priority = 1, dataProvider = "leet",dataProviderClass = _3_DataProvider.class,groups = {"Sanity"})
//    public void Login_2 (String Email,String Pwd) throws MalformedURLException, InterruptedException {
//        Start_Browser browser=new Start_Browser();
//        this.driver=browser.Browser();
//        driver.navigate().to("https://leetcode.com/problemset/");
//        driver.findElement(By.xpath("//div/a[@id=\"navbar_sign_in_button\"]")).click();
//        driver.findElement(By.id("id_login")).click();
//        driver.findElement(By.id("id_login")).sendKeys(Email);
//        driver.findElement(By.id("id_password")).click();
//        driver.findElement(By.id("id_password")).sendKeys(Pwd);
//        driver.findElement(By.xpath("//div/span[contains(text(),'Sign In')]")).click();
//
//
//    }
}
