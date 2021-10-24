package programs;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import scala.collection.mutable.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;

public class Sample3Post {

	public static void main(String[] args) {
		RestAssured.baseURI= "http://216.10.245.166/"; 
		String ArvindBook= "ArvindBook";
		String Version= "2.9";
//		given().
//			header("contenType", "application/json").
//			body("{\r\n"
//					+ "\"name\":\"Learn Appium Automation with Java.\",\r\n"
//					+ "\"isbn\":\""+ArvindBook+"\",\r\n"
//					+ "\"aisle\":\""+Version+",\r\n"
//					+ "\"author\":\"John foe\"\r\n"
//					+ "}").
//		when().
//			post("Library/Addbook.php").
//		then().assertThat().statusCode(200);
		
		//System.out.println("book added successfully");
		
		given().log().body().
		
			header("Content-Type", "application/json").
				body("{\r\n"
						+ "\"name\":\"Learn Appium Automation with Java.\",\r\n"
						+ "\"isbn\":\""+ArvindBook+"\",\r\n"
						+ "\"aisle\":\""+Version+"\",\r\n"
						+ "\"author\":\"John foe\"\r\n"
						+ "}").
			when().
			post("Library/Addbook.php").
			
			then().log().all().assertThat().statusCode(200);
		
		
			

	}

}
