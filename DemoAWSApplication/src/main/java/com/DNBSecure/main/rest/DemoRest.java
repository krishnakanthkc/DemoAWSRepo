package com.DNBSecure.main.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {

	@GetMapping("/rest")
	public String showData() {
		return "rest";
	}
}
