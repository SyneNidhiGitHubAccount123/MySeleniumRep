package Basics;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqBetter
{

	@Test
	public void testReqBetter()
	{
		RestAssured.baseURI="http://localhost:8888";
		RestAssured.port=8888;
		RestAssured.basePath="/student/list";
		
		Response res= given().contentType(ContentType.JSON).log().all().get();
		
		res.prettyPrint();
	}
	
}
