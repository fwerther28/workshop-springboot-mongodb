package com.fwerther28.workshopmongodb.resources;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fwerther28.workshopmongodb.domain.User;
import com.fwerther28.workshopmongodb.dto.UserDTO;
import com.fwerther28.workshopmongodb.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserResources {
	
	private final UserService service;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		
		List<User> list = service.findAll();
		
		List<UserDTO> listDTO = list.stream()
				.map(UserDTO::new)
				.collect(Collectors.toList());
		
		return ResponseEntity.ok().body(listDTO);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
		
		User obj = service.findById(id);
		
		UserDTO objDTO = new UserDTO(obj);
		
		return ResponseEntity.ok().body(objDTO);
	}
}
