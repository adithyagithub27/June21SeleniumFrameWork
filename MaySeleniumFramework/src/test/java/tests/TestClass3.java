package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass3 {
	
	@DataProvider(name="testdata")

    public Object[][] dataProvFunc(){
        return new Object[][]{
                {"adithya"},{"mike"},{"raj"}
        };
    }

	
	
	@Test(dataProvider="testdata")
	public void test5(String names) {
		
		System.out.println("test 5 executed");
		System.out.println(names);
	}

}
