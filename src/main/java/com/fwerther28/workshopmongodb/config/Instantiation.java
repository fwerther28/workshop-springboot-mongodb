package com.fwerther28.workshopmongodb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.fwerther28.workshopmongodb.domain.Post;
import com.fwerther28.workshopmongodb.domain.User;
import com.fwerther28.workshopmongodb.dto.AuthorDTO;
import com.fwerther28.workshopmongodb.dto.CommentDTO;
import com.fwerther28.workshopmongodb.repository.PostRepository;
import com.fwerther28.workshopmongodb.repository.UserRepository;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
@Builder(builderMethodName = "builder")
public class Instantiation implements CommandLineRunner {
	
	private final UserRepository userRepository;
	private final PostRepository postRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		postRepository.deleteAll();
	
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Robert Grey", "bobt@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		CommentDTO c1 = CommentDTO.builder()
						.text("Have a good trip, bro!")
						.date(Instant.parse("2018-03-21T11:00:00Z"))
						.author(new AuthorDTO(alex))
						.build();
		
		CommentDTO c2 = CommentDTO.builder()
				.text("Enjoy your time there!")
				.date(Instant.parse("2018-03-23T15:30:00Z"))
				.author(new AuthorDTO(bob))
				.build();
		
		CommentDTO c3 = CommentDTO.builder()
				.text("Have a wonderful day!")
				.date(Instant.parse("2018-03-23T09:15:00Z"))
				.author(new AuthorDTO(bob))
				.build();
		
		Post post1 = Post.builder()
							.date(Instant.parse("2018-03-21T10:00:00Z"))
							.title("Off on a trip")
							.body("Travelling to Sâo Paulo. See you around!")
							.author(new AuthorDTO(maria))
							.comment(c1)
							.comment(c2)
							.build();
		
		Post post2 = Post.builder()
				.date(Instant.parse("2018-03-21T08:00:00Z"))
				.title("Good morning")
				.body("Woke up feeling great today")
				.author(new AuthorDTO(maria))
				.comment(c3)
				.build();
							
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(maria);
	}	
}
