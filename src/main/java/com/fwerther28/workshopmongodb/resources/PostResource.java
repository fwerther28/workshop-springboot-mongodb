package com.fwerther28.workshopmongodb.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fwerther28.workshopmongodb.domain.Post;
import com.fwerther28.workshopmongodb.resources.util.URL;
import com.fwerther28.workshopmongodb.services.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/posts")
@RequiredArgsConstructor
public class PostResource {
	
	private final PostService service;
	
	@GetMapping(value = "/titlesearch")
	public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
		text = URL.decodeParam(text);	
		List<Post> list = service.findByTitle(text);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/titlesearchquery")
	public ResponseEntity<List<Post>> searchTitle(@RequestParam(value = "text", defaultValue = "") String text) {
		text = URL.decodeParam(text);	
		List<Post> list = service.searchTitle(text);
		return ResponseEntity.ok().body(list);
	}
}
