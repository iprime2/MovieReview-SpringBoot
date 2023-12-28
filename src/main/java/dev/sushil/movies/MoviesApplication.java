package dev.sushil.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MoviesApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);
//		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<String> apiRoot(){
		return new ResponseEntity<String>("All movies", HttpStatus.OK);
	}
}
