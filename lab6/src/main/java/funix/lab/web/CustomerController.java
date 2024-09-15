package funix.lab.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//Lab 6.1: Show form
	@GetMapping("/show-form")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	//Lab6.2: Xác thực dữ liệu từ form
	@PostMapping("/process-form")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult,Model theModel) {
		if(bindingResult.hasErrors()) {
			return  "customer-form";
		}
		theModel.addAttribute("customer", customer);
		return "customer-confirmation";
	}
}
