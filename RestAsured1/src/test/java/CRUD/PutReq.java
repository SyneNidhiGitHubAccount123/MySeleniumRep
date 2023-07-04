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

public class PutReq 
{

	@Test
	public void testPutReq()
	{
		RestAssured.baseURI="http://localhost:8888";
		RestAssured.basePath="/student";
		
		File payload = new File("C:\\Users\\Nidhi.Khandelwal\\Workspace1\\RestAsured1\\Student");
		
		Response res =given().contentType(ContentType.JSON).log().all().body(payload).put("/10");
		
		res.prettyPrint();
	
		
	}
}
