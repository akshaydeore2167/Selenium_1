package _1_Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _9_Use_Of_DataProvider {
    @Test(dataProvider = "Data",dataProviderClass = _8_Data_Provider.class)
    public void Use_Data(String email,String pwd){
        System.out.println(email + pwd);
    }
}
