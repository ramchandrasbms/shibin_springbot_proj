package in.jt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "welcome to java techniques.....Mr.Ram";
	}
}
