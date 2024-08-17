package req;

import java.util.Map;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_POST {
	@Test
	
	void test_001() {
		
		// Map<String, Object> map = new HashMap<String , Object>();
		
		//map.put("name", "raghav");
		//map.put("job", "Teacher");
		
		//System.out.println(map);
		
		/*JSONObject request = new JSONObject();
		request.put("name", "raghav");
		request.put("job", "Teacher"); */
		
		
		JSONObject request = new JSONObject();
		System.out.println(request); 
		System.out.println(request.toJSONString());
			
		given().
			header("content-type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201)
			.log().all();

	}
	

}
