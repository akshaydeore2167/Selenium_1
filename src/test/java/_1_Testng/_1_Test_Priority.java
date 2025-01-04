package _1_Testng;

import org.testng.annotations.Test;

public class _1_Test_Priority {
    @Test(priority = 1)
  public void Start(){
      System.out.println("Start The Browser");
  }
  @Test(priority = 2)
    public void Run(){
      System.out.println("Run The Code");
  }
  @Test(priority = 3)
    public void Close(){
      System.out.println("Close The Browser");
  }
}
