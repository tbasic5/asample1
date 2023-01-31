package com.tech.sosample1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BranchController1 {

	@RequestMapping("/brh1")
	public String brh1() {
		return "brhf1/brh1";
	}
}
