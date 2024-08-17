package req;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Put {
	@Test
	
	void test_1() {
		JSONObject request = new JSONObject();
		request.put("name", "raghav");
		request.put("job", "Teacher");
		
		System.out.println(request.toJSONString());
		
		given().
		header("content-type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		put("https://reqres.in/api/users/2").
	then().
		statusCode(200)
		.log().all();
	}

}
