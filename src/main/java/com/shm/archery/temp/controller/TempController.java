package com.shm.archery.temp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TempController {
	
	@GetMapping("/")
	public String getRoot() {
		return "root";
	}
	
	@GetMapping("/test")
	public String getTest() {
		return "test";
	}
}
