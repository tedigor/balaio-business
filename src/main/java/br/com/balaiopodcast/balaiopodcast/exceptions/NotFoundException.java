package br.com.balaiopodcast.balaiopodcast.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2858450951533048289L;
	
	
	public NotFoundException(String msg) {
		super(msg);
	}
	
	public static NotFoundException build(String msg) {
		return new NotFoundException(msg);
	}
}
