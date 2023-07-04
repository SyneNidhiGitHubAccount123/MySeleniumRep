package PostDifferentWays;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

class PostReqStudent
{

	@Test
	public void name()
	{
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
		
		List<String> courses = new ArrayList();
		courses.add("java");
		courses.add("c++");
		courses.add("c#");
		
		Student stu = new Student("Abhinav","kaushik","abhinav.kaushik@gmail.com","computer science",courses);		
		given().contentType(ContentType.JSON).log().all().body(stu).post();
		
	}
}
