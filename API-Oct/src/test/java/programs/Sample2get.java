package programs;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import scala.collection.mutable.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;


public class Sample2get {

	public static void main(String[] args) {
		
		// To validate json body
				//Note: i changed the URI, below line is the example
				//http://dummy.restapiexample.com/api/v1/employees
		RestAssured.baseURI= "http://dummy.restapiexample.com";
		
		given().
		when().
			get("/api/v1/employees").
		then().
			assertThat().body("data[1].employee_name", equalTo("Garrett Winters")).
			and().body("data[1].employee_salary", equalTo(170750));
		
		
		System.out.println("actual name of employee is Garrett Winters and salary is 170750");
	}

}
//abcs

