package CrudOperation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutRequestTest
{
	
	@Test
	public void name() 
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8080;
		RestAssured.basePath="/student";
		
	    File json= new File("C://Users//Nidhi.Khandelwal//Workspace1//LearningRestAssured//Student2.json");
		
		Response res=given().contentType(ContentType.JSON).log().all().body(json).put("/101");
		
		res.prettyPrint();
		
		
	}

}
