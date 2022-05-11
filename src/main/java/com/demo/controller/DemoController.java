package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Message;

@RestController
@RequestMapping("/api")
public class DemoController {
	@GetMapping("/message")
	public ResponseEntity<String> getMessage(@RequestParam(required = true) int ide) {
		
		String message="I am from getmapping method"+ide;
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	@PostMapping("/message")
	public ResponseEntity<Message> addMessage(@RequestBody Message message){
		
		
		return new ResponseEntity<Message>(message,HttpStatus.CREATED);
	}
}