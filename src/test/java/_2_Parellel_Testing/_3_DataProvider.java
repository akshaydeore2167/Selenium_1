package _2_Parellel_Testing;

import org.testng.annotations.DataProvider;

public class _3_DataProvider {
    @DataProvider(name = "Git")
    public Object [][] Provider(){
        Object[][] data={{"akshaydeore2167","Akshay@6525"}};
        return data;
    }
    @DataProvider(name = "leet")
    public Object [][] Provider_leet(){
        Object[][] data={{"akshaydeore9001","Akshay@6525"}};
        return data;
    }
}
