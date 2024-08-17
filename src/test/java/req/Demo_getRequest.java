package req;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Demo_getRequest {
	
	@Test
	public void getBookDetails() {
		
		given()
		  .when()
		  	.get("https://demoqa.com/BookStore/v1/Books")
		  	.then()
		  	.statusCode(200)
		  	.statusLine("HTTP/1.1 200 OK")
		  	.header("Connection", "keep-alive");
		  	
	}

}
