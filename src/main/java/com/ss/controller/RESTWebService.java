package com.ss.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.entity.User;

@RestController
public class RESTWebService {
	   
	   @GetMapping("/users")
	   public ResponseEntity<List<User>> list() {
		   System.out.println("users called");
	      List<User> users = new ArrayList<User>();
	      users.add(new User());
	      return ResponseEntity.ok().body(users);
	   }
	   
}
