package Req2Simple;

public class Student
{
	public String firstName;
	public String lastName;
	public String email;
	public String programme;
	public Courses course;
	
	public Student(String firstName, String lastName, String email, String programme) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.programme = programme;
	}

	public String getFirstName() {
		return firstName;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
	
	

}
