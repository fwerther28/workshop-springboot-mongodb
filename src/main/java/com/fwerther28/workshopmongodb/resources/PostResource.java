package com.fwerther28.workshopmongodb.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fwerther28.workshopmongodb.domain.Post;
import com.fwerther28.workshopmongodb.services.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PostResource {
	
	private final PostService service;
	
	@GetMapping(value = "/tittlesearch")
	public ResponseEntity<List<Post>> findByTittle(@RequestParam(value = "text", defaultValue = "") String text) {
		List<Post> list = service.findByTitle(text);
		return ResponseEntity.ok().body(list);
	}
	
}
