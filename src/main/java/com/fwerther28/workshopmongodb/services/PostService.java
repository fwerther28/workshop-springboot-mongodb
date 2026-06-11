package com.fwerther28.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fwerther28.workshopmongodb.domain.Post;
import com.fwerther28.workshopmongodb.repository.PostRepository;
import com.fwerther28.workshopmongodb.resources.exception.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
	
	private final PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found. Id: " + id));
	}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
