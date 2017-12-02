package com.ajinkya.jpa.basics.springbootjpademo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajinkya.jpa.basics.springbootjpademo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
