package _1_Testng;

import org.testng.annotations.Test;

public class _2_XML_Listners {

    @Test(priority = 1)
    public void Start(){
        System.out.println("Start The Browser");
    }
    @Test(priority = 2)
    public void Check(){
        System.out.println("Check The Code");
    }
    @Test(priority = 3)
    public void Close(){
        System.out.println("Close The Browser");
    }
}
