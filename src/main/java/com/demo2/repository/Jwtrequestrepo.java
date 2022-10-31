package com.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo2.Entity.JwtRequest;

@Repository
public interface Jwtrequestrepo extends JpaRepository<JwtRequest,Long> {
  public JwtRequest findByUsername(String username);
}
