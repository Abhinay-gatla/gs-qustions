package com.gs.test.longestpalindrome.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gs.test.longestpalindrome.service.PalindromeService;


@RestController
public class AppController {

	  PalindromeService service;
	  
	  AppController(PalindromeService service){ this.service = service; }

	 /*
	  *  Rest end point to find longest palindrome substring
	  *  Example url : http://localhost:8080/longpalind?string=ruur
	  *  
	  */
	  
	  @GetMapping(value = "/longpalind") 
	  public String getLongestPalindromeSubstring(@RequestParam(value = "string") String input) { 
		  return service.getLongPalindSubstr(input); 
	  }
	 

}
