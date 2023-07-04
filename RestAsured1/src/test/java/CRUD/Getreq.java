package CRUD;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Getreq 
{
	
//	@Test
//	public void testGetReq()
//	{
//		RestAssured.baseURI="http://localhost:8888";
//		RestAssured.basePath="/student";
//		
//		Response res=given().contentType(ContentType.JSON).log().all().get("/list");
//		
//		res.prettyPrint();
//		
//	}
	
	
//	@Test
//	public void testGetReq1()
//	{
//		RestAssured.baseURI="http://localhost:8888";
//		RestAssured.basePath="/student";
//		
//		Response res=given().contentType(ContentType.JSON).log().all().get("/10");
//		
//		res.prettyPrint();
//		
//		
//	}
	
	
//	@Test
//	public void testGetReq2()
//	{
//		RestAssured.baseURI="http://localhost:8888";
//		RestAssured.basePath="/student";
//		
//		Response res=given().contentType(ContentType.JSON).log().all().get("?programme=Financial Analysis");
//		
//		res.prettyPrint();
//		
//		
//	}
//	
	

	@Test
	public void testGetReq3()
	{
		RestAssured.baseURI="http://localhost:8888";
		RestAssured.basePath="/student";
		
		Response res=given().contentType(ContentType.JSON).log().all().get("?programme=Financial Analysis&limit=2");
		
		res.prettyPrint();
		
		
	}


}
