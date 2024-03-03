package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DefaultController {

	@GetMapping("/getmsg")
	public String getMessage() {
		return "Spring Security..";
	}

}
