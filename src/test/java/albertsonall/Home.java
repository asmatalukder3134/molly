package albertsonall;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Home {
	
	
	@Test(dataProvider="data")
	public void click2(String name,String pw) {
		System.out.println(name);
		System.out.println(pw); 
		
		
	}
	@DataProvider(name="data")
	public Object[][] mydata() {
		Object [][]obj=new Object[2][2];
		obj[0][0]="asma";
		obj[0][1]="12";
		obj[1][0]="suha";
		obj[1][1]="123";
		return obj;
	}
	
	
}
