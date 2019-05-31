package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apple.biz.Apple;
import com.apple.biz.IApple;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		IApple apple = new Apple();
		return apple.getName("Spring Boot 2.0!");
	}
}