package com.example.demo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@GetMapping("/demo")
	public String getDemo () {
		String demo = demoService.getDemo();
		
		return demo;
	}
	
	@PostMapping("/demo")
	public String postDemo () {
		String demo = demoService.getDemo();
		
		return demo;
	}
	

	
}