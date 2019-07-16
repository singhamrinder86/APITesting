package apiDemo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class basicsLect17TestNG {

	@Test
	public void Test() {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://maps.googleapis.com";
		
		given().
		param("location","-33.8670522,151.1957362").
		param("radius","500").
		param("key","AIzaSyDcnDzgrFs5RjQFQc7cwLbSzNC2SUO8qd8").
		when().
		get("/maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200);
//		and().
//		contentType(ContentType.JSON).and().
//		body("results[0].name", equalTo("Sydney"));

	}

}
