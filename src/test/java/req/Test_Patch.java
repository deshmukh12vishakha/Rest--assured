package req;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Patch {
	@Test
	
	void test0_patch() {
		
		
	JSONObject request = new JSONObject();
	
	request.put("name", "raghav");
	request.put("job", "Teacher");
	
	System.out.println(request); 
	System.out.println(request.toJSONString());
		
	given().
		header("content-type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		patch("https://reqres.in/api/users/2").
	then().
		statusCode(200);

}
}