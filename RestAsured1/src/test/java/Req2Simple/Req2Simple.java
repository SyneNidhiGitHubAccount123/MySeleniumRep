package Req2Simple;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Req2Simple

{
	
	@Test
	public void name()
	{
		
		RestAssured.baseURI="http://localhost:8888/";
		RestAssured.basePath="student";
		
		
		Student stu = new Student("Abhinav","Kaushik","ahdhfffdh@gmail.com","CSE");
		Courses course = new Courses("Java","80");
		stu.setCourse(course);
		
		Response res=given().contentType(ContentType.JSON).log().all().body(stu).post();
		
		res.prettyPrint();
		
		
		
	}

}
