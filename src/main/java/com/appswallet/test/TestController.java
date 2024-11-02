package com.appswallet.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping({"/","/home","/status"})
	public String getStatus() {
		return "It is working... brotherrrrrr";
	}
}
