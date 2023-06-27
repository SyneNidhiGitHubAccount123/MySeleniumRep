package Postreq;

import java.io.File;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonArrayAndJsonObject 
{
		

	@Test
	public void name()
	{
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath= "/student";
			
		JSONObject obj = new JSONObject();
		obj.put("email", "abhinav.kaushik@gmail.com");
		obj.put("programme", "computer science");
		obj.put("lastName", "kaushik");
		obj.put("firstName", "Abhinav");		
		
		JSONArray arr = new JSONArray();
		arr.put("java");
		arr.put("c++");
		arr.put("c");
		
		obj.put("courses", arr);		
		
	//	Response resp = given().contentType(ContentType.JSON).log().body().body(obj).post();
		
		Response resp=	given().contentType(ContentType.JSON).log().all().body(obj.toString()).post();
		
		resp.prettyPrint();
		
	}


}
