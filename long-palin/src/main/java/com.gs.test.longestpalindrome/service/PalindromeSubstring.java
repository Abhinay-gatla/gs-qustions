package com.gs.test.longestpalindrome.service;

import org.springframework.stereotype.Service;

/*
 * Service to compute the longest palindromic substring for a given string input
 * 
 */

@Service
public class PalindromeSubstring {
  
	public String getLongestPalindromeSubstring(String input) {
		if(input == null || input.isEmpty()) return " ";
		
	    int start = 0, end = 0;
	    for (int i = 0; i < input.length(); i++) {
	        int length1 = checkPalindrome(input, i, i);
	        int length2 = checkPalindrome(input, i, i + 1);
	        int length = Math.max(length1, length2);
	        if (length > end - start) {
	            start = i - (length - 1) / 2;
	            end = i + length / 2;
	        }
	    }
	    return input.substring(start, end + 1);
	}

	private int checkPalindrome(String s, int left, int right) {
	    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	    	left--;
	    	right++;
	    }
	    return right - left - 1;
	}
		
}
