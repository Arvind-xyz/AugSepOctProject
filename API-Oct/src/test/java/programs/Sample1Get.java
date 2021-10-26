package programs;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import scala.collection.mutable.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;

public class Sample1Get {

	public static void main(String[] args) {	
		
		RestAssured.baseURI= "https://postman-echo.com";
		
		given().
		 param("foo1", "bar1").
		 param("foo2", "bar2").
		 	
		 when().
		 	get("/cookies/set").
		  
		 then().
		 	assertThat().contentType(ContentType.JSON).and().statusCode(200);
		
		System.out.println("Arvind");
	}

	
    
}
//abc

