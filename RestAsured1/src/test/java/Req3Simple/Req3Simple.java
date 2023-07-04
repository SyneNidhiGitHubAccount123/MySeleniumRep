package Req3Simple;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Req3Simple 
{

	@Test
	public void name() 
	{
		RestAssured.baseURI="http://localhost:8888/";
		RestAssured.basePath="student";
		
		Student stu = new Student("Abhinav","Kaushik","CSE","ahdhfffdh@gmail.com");
		Courses course = new Courses("Java","70");
		Courses course1 = new Courses("C++","70");
		stu.addCourse(course);
		stu.addCourse(course1);		
		
		Response res=   given().contentType(ContentType.JSON).log().all().body(stu).post();
		res.prettyPrint();
		
		
	}
}
