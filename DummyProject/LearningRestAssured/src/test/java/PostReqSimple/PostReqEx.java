package PostReqSimple;
import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import Postreq.JsonArrayAndJsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostReqEx 
{

	@Test
	public void testPostreq()
	{
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		List<String> courses = new ArrayList();
		
		courses.add("java");
		courses.add("c++");
		courses.add("c");
		
		Student stu = new Student("Abhinav","kaushik","abhinav.kaushik@gmail.com","computer science",courses);
		
		given().contentType(ContentType.JSON).log().all().body(stu).post();
		
		
		
		
	}
	
}
