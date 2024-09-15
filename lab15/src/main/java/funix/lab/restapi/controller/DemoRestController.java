package funix.lab.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import funix.lab.restapi.entity.Student;

@RestController
@RequestMapping("/test")
public class DemoRestController {
	
	//Lab 15.1: Tải Postman
	//Lab 15.2: Hiển thị HelloWorld!
	@GetMapping("/hello")
	public String sayHello() {
		return " Lab15.1, 15.2: Hello World!";
	}
	
	//Lab15.3, 15.4
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList();
		students.add(new Student("Poornima", "Patel"));
		students.add(new Student("Mario", "Rossi"));
		students.add(new Student("Mary", "Smith"));
		return students;
	}
}
