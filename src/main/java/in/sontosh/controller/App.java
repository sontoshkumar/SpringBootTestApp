package in.sontosh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sk")
public class App {

	@GetMapping("/wel")
	private String welCome() {
		return "Wel Come To GitHub!!";
	}

}
