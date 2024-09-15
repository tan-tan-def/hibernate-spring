package funix.lab.web4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	//Lab5.4: Tạo đối tượng student và lưu vào Modal
	@RequestMapping("/show-form")
	public String showForm(Model theModel) {
		Student student = new Student();
		theModel.addAttribute("student",student);
		return "student-form";
	}
	
	//Lab5.5, 5.6: Tạo form và submit form
	@PostMapping("/process-form")
	public String processForm(@ModelAttribute("student") Student student, Model theModel) {
		theModel.addAttribute("student", student);
		return "student-confirmation";
	}
	//Lab 5.7, 5.8
	
}
