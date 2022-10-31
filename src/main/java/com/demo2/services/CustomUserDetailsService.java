package com.demo2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo2.Entity.JwtRequest;
import com.demo2.repository.Jwtrequestrepo;

import ExceptionHandler.UserException;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	Jwtrequestrepo requestrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		JwtRequest user= requestrepo.findByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("invailed user....");
		}
		else
		{
			return new CustomUserDetails(user);
		}
		
		
	}

}
