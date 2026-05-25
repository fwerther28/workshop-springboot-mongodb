package com.fwerther28.workshopmongodb.dto;

import java.io.Serializable;

import com.fwerther28.workshopmongodb.domain.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO(User obj) {
		this.id = obj.getId();
		this.name = obj.getName();	
		this.email = obj.getEmail();
	}
}
