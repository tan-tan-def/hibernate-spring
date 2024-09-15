package funix.lab.web1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	
	//Lab5.1: Hiển thị form
	@GetMapping("/show-form")
	public String letsShoutDude() {
		return "hello-world-form-ver3";
	}
	
	//Lab5.1: Hiển thị lại bằng @RequestParam
	@PostMapping("/process-form")
	public String processFormVer2(@RequestParam("studentName") String studentName, Model theModel ) {
		studentName = studentName.toUpperCase();
		String result = "Hey my friends from v3! " + studentName;
		theModel.addAttribute("result", result);
		theModel.addAttribute("studentName", studentName);
		return "hello-world-ver3";
	}
}
