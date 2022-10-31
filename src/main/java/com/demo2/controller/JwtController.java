package com.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.Entity.JwtRequest;
import com.demo2.helper.JwtUtil;

import ExceptionHandler.UserException;

//import ExceptionHandler.UserException;

@RestController
public class JwtController {
  
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtutil;
	
	@PostMapping("/login")
	public ResponseEntity<String> generateToken(@RequestBody JwtRequest jwtrequest) throws UserException
	{
		try
		{
			System.out.println("hiiii arif......");
			

			this.authenticationManager.
			authenticate(new UsernamePasswordAuthenticationToken(jwtrequest.getUsername(), jwtrequest.getPassword()));
			

		}
		catch(Exception ex)
		{
			throw new UserException("invailed credential...");
		}
		
		String token=jwtutil.generateToken(jwtrequest.getUsername());
		
		return new ResponseEntity<String>(token,HttpStatus.OK);
		
		
	}
	
}
