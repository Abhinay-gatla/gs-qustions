package com.gs.test.longestpalindrome.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gs.test.longestpalindrome.entity.Palindrome;

/*
 * Repository to work In memory H2 with database like save and fetch
 * 
 */

@Repository
public interface Repo extends JpaRepository<Palindrome, Integer>{
}
