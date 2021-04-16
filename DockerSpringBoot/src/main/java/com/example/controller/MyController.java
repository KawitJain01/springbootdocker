package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	private static final String HELLO = "Hello";
	private static final String SPACE_DELIMETER = " ";
	
	@GetMapping("{name}")
	public String name(@PathVariable String name)
	{
		return HELLO + SPACE_DELIMETER + name;
	}
}
