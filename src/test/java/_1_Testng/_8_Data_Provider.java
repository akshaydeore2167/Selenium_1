package _1_Testng;

import org.testng.annotations.DataProvider;

public class _8_Data_Provider {
    @DataProvider(name = "Data")
    public Object [][] Provider(){
        Object[][] data={{"akshay.deore@entytle.com","Akshay"}};
        return data;
    }
}
