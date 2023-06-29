package PostReq2;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import java.io.File;
import org.testng.annotations.Test;
import Postreq.JsonArrayAndJsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import PostReq2.Courses;
import PostReq2.Student;
import io.restassured.RestAssured;

public class StudentPostreq
{

//	@Test
//	public void postreq()
//	{	
//		
//		RestAssured.baseURI = "http://localhost";
//		RestAssured.port = 8080;
//		RestAssured.basePath = "/student";
//		
//		Student stu = new Student("Nidhi","Khandelwal","nidhirk@yahoo.com","Computer science");
//		
//		stu.setCourse(new Courses("java","Nidhi"));
//		
//		
//		given().contentType(ContentType.JSON).log().all().body(stu).post();
//		
//		
//	}
	
	@Test
	public void postreq()
	{	
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		Student stu = new Student("Abhinav","Kaushik","CSE","ahdhfffdh@gmail.com");
		
		Courses obj = new Courses("Java","80");
		stu.setCourse(obj);		
		
		Response resp = given().contentType(ContentType.JSON).log().body()
				.body(stu).post();
		
		System.out.println("-----------RESPONSE---------------");
		resp.prettyPrint();		
		
	}

		
		
		
		
	}

