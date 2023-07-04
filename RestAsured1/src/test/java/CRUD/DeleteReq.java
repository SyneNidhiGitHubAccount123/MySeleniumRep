package CRUD;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DeleteReq
{
	@Test
    public void testDeleteReq()
    {
    	RestAssured.baseURI="http://localhost:8888";
		RestAssured.basePath="/student";
		
		Response res = given().contentType(ContentType.JSON).log().all().delete("/100");
		
		res.prettyPrint();
	}
}
