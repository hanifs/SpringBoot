package com.jrp.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UpdateImage {
	
	@GetMapping("/")
	public String imageUpdated() {
		return "working...";
	}

}
