package funix.lab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerLab4_1_2 {
	
	//Lab 4.1, 4.2: Hiển thị Spring MVC Demo - Home Page
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
