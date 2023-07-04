package PostDifferentWays;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class JsonObjectAndJsonArray

{

	@Test
	public void name()
	{
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
		
		JSONObject obj = new JSONObject();
		obj.put("firstName","Abhinav");
		obj.put("latsName", "Kasushik");
		obj.put("email", "abdhd@gmail.com");
		obj.put("programme", "CS");
		
		JSONArray arr = new JSONArray();
		
		arr.put("java");
		arr.put("c++");
		arr.put("c#");
		
		obj.put("courses", arr);
		
		given().contentType(ContentType.JSON).log().body().body(obj.toString()).post();
		
	}
}
