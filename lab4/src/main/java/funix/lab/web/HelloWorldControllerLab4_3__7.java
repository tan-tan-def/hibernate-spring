package funix.lab.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldControllerLab4_3__7 {
	
	//Lab 4.3: Hiển thị form để submit
	//Lab 4.5: Hiển thị link để liên kết form
	@RequestMapping("/show-form")
	public String showForm() {
		return "hello-world-form";
	}
	
	//Lab 4.4: Hiển thị thông tin sau  khi submit form không sử dụng Spring Model
	@GetMapping("/process-form")
	public String processForm() {
		return "hello-world";
	}
	
	//Lab 4.6: Hiển thị form
	@GetMapping("/show-form-ver2")
	public String letsShoutDude() {
		return "hello-world-form-ver2";
	}
	
	//Lab 4.7: Hiển thị thông tin sau  khi submit form có spring Model
	@PostMapping("/process-form-ver2")
	public String processFormVer2(HttpServletRequest request, Model theModel ) {
		String studentName = request.getParameter("studentName");
		studentName = studentName.toUpperCase();
		String result = "Yo! " + studentName;
		theModel.addAttribute("studentName", result);
		return "hello-world-ver2";
	}
}
