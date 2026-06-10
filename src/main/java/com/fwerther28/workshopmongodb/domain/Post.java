package com.fwerther28.workshopmongodb.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fwerther28.workshopmongodb.dto.AuthorDTO;
import com.fwerther28.workshopmongodb.dto.CommentDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "post")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@EqualsAndHashCode.Include
	private String id;
	
	private Instant date;
	private String title;
	private String body;
	
	private AuthorDTO author;
	
	@Singular
	private List<CommentDTO> comments;
}
