package org.kidding.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {

	@RequestMapping("/accessError")
	public void accessError(Authentication auth, Model model) {
		
		log.info(auth);
		model.addAttribute("msg", "Access Error");
		
	}
	
}
