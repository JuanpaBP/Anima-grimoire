package anima.project.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class PingController {
	
	@GetMapping("/ping")
	public String ping()
	{
		return "pong";
	}

}
