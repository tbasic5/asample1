package com.tech.sosample1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BConroller1 {

	@RequestMapping("/hi1")
	public String hi1() {
		return "hi/hi1";
	}
}