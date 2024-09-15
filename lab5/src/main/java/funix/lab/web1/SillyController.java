package funix.lab.web1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class SillyController {
	//Lab 5.2: Hiển thị lỗi khi trùng đường dẫn
	@GetMapping("/show-form")
	public String letsShoutDude() {
		return "silly";
	}
}
