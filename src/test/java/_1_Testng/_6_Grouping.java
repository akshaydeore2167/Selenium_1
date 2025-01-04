package _1_Testng;

import org.testng.annotations.Test;

public class _6_Grouping {
    @Test(groups = {"Sanity"})
    public void One(){
        System.out.println("One");
    }
    @Test(groups = {"Regression"})
    public void Two(){
        System.out.println("Two");
    }
    @Test(groups = {"Sanity"})
    public void Three(){
        System.out.println("Three");
    }
    @Test(groups = {"Regression"})
    public void Four(){
        System.out.println("Four");
    }
    @Test(groups = {"Functional"})
    public void Five(){
        System.out.println("Five");
    }
    @Test(groups = {"Functional"})
    public void Six(){
        System.out.println("Six");
    }
    @Test(groups = {"Sanity","Rgression","Functional"})
    public void Seven(){
        System.out.println("Seven");
    }
}
