package funix.lab.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min=2, message = "is required")
	private String lastName;
	
	@CourseCode(value = "VN", message = "must start with VN")
	private String courseCode;

	public String getFirstName() {
		return firstName;
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

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
}
