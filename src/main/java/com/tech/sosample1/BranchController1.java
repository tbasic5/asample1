package com.tech.sosample1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BranchController1 {

	@RequestMapping("/brh1")
	public String brh1() {
		return "brhf1/brh1";
	}
	
	@RequestMapping("/brh5")
	public String brh5() {
		return "brhf1/brh5";
	}
	
	
	@RequestMapping("/brh2")
	public String brh2() {
		return "brhf1/brh2";
	}
	@RequestMapping("/brh3")
	public String brh3() {
		return "brhf1/brh3";
	}

	
	
}
