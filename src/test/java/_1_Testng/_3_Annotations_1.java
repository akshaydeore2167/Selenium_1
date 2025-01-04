package _1_Testng;

import org.testng.annotations.*;

public class _3_Annotations_1 {
    @Test
    public void Test(){
        System.out.println("Test");
    }
    @BeforeMethod
    public void Before_Method(){
        System.out.printf("Before_Method");
    }
    @AfterMethod
    public void After_Method(){
        System.out.println("After_Method");
    }
    @BeforeClass
    public void Before_Class(){
        System.out.println("Before_Class");
    }
    @AfterClass
    public void After_class(){
        System.out.println("After Class");
    }
    @BeforeTest
    public void Before_Test(){
        System.out.println("Before_Test");
    }
    @AfterTest
    public void After_Test(){
        System.out.println("After_Test");
    }
    @BeforeSuite
    public void Before_Suite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void After_Suite(){
        System.out.println("After Suite");
    }
}
