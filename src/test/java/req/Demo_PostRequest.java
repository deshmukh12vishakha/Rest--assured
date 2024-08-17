package req;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Demo_PostRequest {
	
	
	
	@Test
	public void testdata() {
		
		JSONObject requestParams = new JSONObject(); 
		requestParams.put("email", "eve.holt@reqres.in"); 
		requestParams.put("password", "pistol"); 

		given().
		header("Connection", "keep-alive").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(requestParams.toJSONString()).
	when().
		post("https://reqres.in/api/register").
	then().
		statusCode(200)
		.log().all();
	
	
	
	}

}
