package _1_Testng;

import org.testng.annotations.Test;

public class _4_Priority_Disable_Test_Case {
    @Test(priority = 1)
    public void Test_1(){
        System.out.println("Test_1");
    }
    @Test(priority = 2)
    public void Test_2(){
        System.out.println("Test_2");
    }
    @Test(priority = 3)
    public void Test_3(){
        System.out.println("Test_3");
    }
    @Test(priority = 4,enabled = false)
    public void Test_4(){
        System.out.println("Test_4");
    }
    @Test(priority = 5)
    public void Test_5(){
        System.out.println("Test_5");
    }
    @Test(priority = 6,enabled = false)
    public void Test_6(){
        System.out.println("Test_6");
    }
    @Test(priority = 7)
    public void Test_7(){
        System.out.println("Test_7");
    }
}
