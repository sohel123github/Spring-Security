package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SecureController {

	@GetMapping("/admin")
//	@PreAuthorize("ADMIN")
	public String getAdmin() {
		return "This is admin..";
	}

	@GetMapping("/user")
//	@PreAuthorize("USER")
	public String getUser() {
		return "This is user..";
	}

	@GetMapping("/public")
	public String getPublic() {
		return "This is public..";
	}
}
