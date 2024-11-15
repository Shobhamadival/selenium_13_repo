package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataStorage {
@DataProvider
public String[][] loginData() {
	String data[][]= {
			{"admin","admin"},
			{"admin","ad"},
			{"ad","admin"},
			{"ad","ad"}
			};
	return data;
}
@Test
public void registerData() {
	String registerData[][]= {
			{"jhon","smith","jhon1234@gmail.com","jhon@1234","jhon@1234"},
			{"davidson","harley","jhon1234@gmail.com","harley@1234","harley@1234"},
			{"jhon","smith","jhon1234@gmail.com","jhon@1234","jhon@1234"},
			{"jhon","smith","jhon1234@gmail.com","jhon@1234","jhon@1234"}
	};
}







}
