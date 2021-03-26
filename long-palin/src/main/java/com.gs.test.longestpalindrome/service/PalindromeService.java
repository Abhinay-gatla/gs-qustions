package com.gs.test.longestpalindrome.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gs.test.longestpalindrome.entity.Palindrome;
import com.gs.test.longestpalindrome.repo.Repo;

/*
 * Service to call the palindrome computation logic, save to database the result 
 * and fetch longest palindrome substring from database 
 * 
 */

@Service
public class PalindromeService {

    PalindromeSubstring palinservice;
	
    Repo repo;
	
	public PalindromeService(PalindromeSubstring service, Repo repo) {
		this.palinservice = service;
		this.repo = repo;
	}
	
	public String getLongPalindSubstr(String input) {
		String longest = palinservice.getLongestPalindromeSubstring(input);
		Palindrome palin = new Palindrome(input, longest);
		repo.save(palin);
		
		Optional<Palindrome> longpal = repo.findById(palin.getId());
		
		return longpal.get().getLongestPalin();
	}
}
