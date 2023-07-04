package PostDifferentWays;

import java.util.ArrayList;
import java.util.List;

public class Student 
{
  public String email ;
  public String programme ;
  public String lastName ;
  public String firstName ;  
  public List<String> courses = new ArrayList<String>();
  
  public Student(String email, String programme, String lastName, String firstName, List<String> courses) {
	super();
	this.email = email;
	this.programme = programme;
	this.lastName = lastName;
	this.firstName = firstName;
	this.courses = courses;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getProgramme() {
	return programme;
}

public void setProgramme(String programme) {
	this.programme = programme;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public List<String> getCourses() {
	return courses;
}

public void setCourses(List<String> courses) {
	this.courses = courses;
}
  
  
  
  
  
}
