package org.kidding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/sample/*")
@Controller
public class SampleController {
	
	@GetMapping("/all")
	public void doAll() {
		log.info("can access everyone");
	}

	//로그인한 사용자만 접근 가능한 URI
	@GetMapping("/member")
	public void doMember() {
		log.info("can access login member");		
	}
	
	//로그인한 사용자 중 관리자 권한 가진 사용자만 접근 가능한 URI	
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("can access admin member");
	}

	@GetMapping("/register")
	public void register() {
		log.info("register...........");
	}
}
