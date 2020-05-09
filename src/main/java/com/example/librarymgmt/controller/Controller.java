package com.example.librarymgmt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/getBookDetails")
	public String getBooks() {
		return "returning books !!!";
	}
	
}
