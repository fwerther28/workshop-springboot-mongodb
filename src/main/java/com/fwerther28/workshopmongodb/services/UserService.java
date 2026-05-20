package com.fwerther28.workshopmongodb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fwerther28.workshopmongodb.domain.User;
import com.fwerther28.workshopmongodb.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
}
