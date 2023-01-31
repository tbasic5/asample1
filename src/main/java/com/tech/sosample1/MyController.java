package com.tech.sosample1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/good1")
	public String good1() {
		
		return "good1";
	}

}
