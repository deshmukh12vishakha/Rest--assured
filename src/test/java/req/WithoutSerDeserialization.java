package req;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class WithoutSerDeserialization {
	
	//public HashMap map = new HashMap();
	
	//post request create a new students records
	@Test(priority = 1)
	public void createNewRecord() {
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
		statusCode(200).
			//body("msg", equalTo("Record added")).
			log().all();
	}
	
	@Test(priority = 2)
	public void getRecord() {
		given().
		get("https://reqres.in/api/users?page=2").
	then().
		statusCode(200).
		body("data.id[1]", equalTo(8)).
		body("data.first_name", hasItems("Michael", "Lindsay"));
	     //log().all();	
	}
	
	

}
