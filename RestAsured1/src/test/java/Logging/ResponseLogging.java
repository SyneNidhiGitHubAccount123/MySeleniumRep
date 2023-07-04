package Logging;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ResponseLogging
{

	@Test
	public void name()
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8888;
		RestAssured.basePath="/student";
		
//		given().contentType(ContentType.JSON).get("/list").then().log().headers();
//		given().contentType(ContentType.JSON).get("/list").then().log().body();
		
		given().contentType(ContentType.JSON).get("list").then().log().ifError();
		
		
		
	}
}
