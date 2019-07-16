package apiDemo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;


import static io.restassured.RestAssured.given;

public class basicsLect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://maps.googleapis.com";
		
		given().
		param("location","-33.8670522,151.1957362").
		param("radius","500").
		param("key","AIzaSyDcnDzgrFs5RjQFQc7cwLbSzNC2SUO8qd8").
		when().
		get("/maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().
		contentType(ContentType.JSON).and().
		body("candidates[0].geometry.location.lat", equalTo("-33.8599358"));

	}

}
