package funix.lab.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import funix.lab.restapi.entity.Student;
import funix.lab.restapi.exception.StudentErrorResponse;
import funix.lab.restapi.exception.StudentNotFoundException;

@RestController
@RequestMapping("/api")
public class DemoRestController {
	
	private List<Student> students = new ArrayList();
	
	@PostConstruct
	public void initialize() {
		students.add(new Student("Poornima", "Patel"));
		students.add(new Student("Mario", "Rossi"));
		students.add(new Student("Mary", "Smith"));
	}
	

	@GetMapping("/student")
	public List<Student> getStudents() {
		return students;
	}
	
	//Lab 16.1
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		if(id<1 || id>students.size()) {
			throw new StudentNotFoundException("Can't found the id " + id);
		}
		return students.get(id - 1);
	}
	
	
}
