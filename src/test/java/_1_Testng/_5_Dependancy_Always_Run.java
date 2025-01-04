package _1_Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _5_Dependancy_Always_Run {
    @Test
    public void Start_Car() {
        System.out.println("Start The Car ");
        Assert.fail();

    }

    @Test(dependsOnMethods = {"Start_Car"})
    public void Drive_Car() {
        System.out.println("Drive The Car");
    }

    @Test(dependsOnMethods = {"Drive_Car"})
    public void Stop_Car() {
        System.out.println("Stop_car");
    }

    @Test(dependsOnMethods = {"Drive_car", "Stop_Car"}, alwaysRun = true)
    public void Park_Car() {
        System.out.println("Park_car");
    }
}
