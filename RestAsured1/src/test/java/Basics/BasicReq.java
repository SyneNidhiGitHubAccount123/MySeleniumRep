package Basics;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BasicReq 
{

	@Test
	public void TestBasicReq()
	{
		RestAssured.baseURI="http://localhost:8888/";
		RestAssured.basePath="student";
		
		RequestSpecification req = given();
		
		req =req.contentType(ContentType.JSON);
		
		req.header("X", "Y");
		req.log().all();
		Response res =req.get("/list");
		
		res.prettyPrint();
		
		System.out.println(res.getCookies());
		
		
	}
}
