package com.gs.test.longestpalindrome.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * Below is the table structure created to hold input string, longest palindrome substring 
 * and auto generated id
 * 
 */

@Entity
public class Palindrome {
    @Id
    @GeneratedValue
    private int id;
    private String inputStr;
    private String longestPalin;
    
    public Palindrome(String input, String longest) {
    	inputStr = input;
    	longestPalin = longest;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInputStr() {
		return inputStr;
	}

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public String getLongestPalin() {
		return longestPalin;
	}

	public void setLongestPalin(String longestPalin) {
		this.longestPalin = longestPalin;
	}
    
    
}
