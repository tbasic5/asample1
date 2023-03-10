package com.tech.sosample1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi(Locale locale, Model model) {
		
		
		return "hi";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/view1", method = RequestMethod.GET)
	public String view1(Locale locale, Model model) {
		
		
		return "view1";
	}
	@RequestMapping(value = "/see1", method = RequestMethod.GET)
	public String see1(Locale locale, Model model) {
		
		
		return "see1";
	}
	@RequestMapping(value = "/bsee2", method = RequestMethod.GET)
	public String bsee2(Locale locale, Model model) {
		
		
		return "bsee2";
	}
	@RequestMapping(value = "/bsee3", method = RequestMethod.GET)
	public String bsee3(Locale locale, Model model) {
		
		
		return "bsee3";
	}
	
}
