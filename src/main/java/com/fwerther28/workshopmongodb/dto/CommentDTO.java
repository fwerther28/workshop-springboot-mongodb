package com.fwerther28.workshopmongodb.dto;

import java.io.Serializable;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String text;
	Instant date;
	AuthorDTO author;
}
