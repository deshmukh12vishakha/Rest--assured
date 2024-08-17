package req;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test_Delete {
 @Test
 
 	void test_001() {
	 
	 given().
		get("https://reqres.in/api/users/2").
	then().
		statusCode(204);	
 }
}
