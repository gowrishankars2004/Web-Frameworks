package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myApplication{
	@GetMapping("/display")
		public String Welcome() {
			return "WELCOME String Boot!";
		}
	}
