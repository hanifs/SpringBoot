package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class FirstController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String springBootDemo() {
		return "working...";
	}

}
