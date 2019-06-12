package br.com.balaiopodcast.balaiopodcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.balaiopodcast.balaiopodcast.dto.EpisodioDto;
import br.com.balaiopodcast.balaiopodcast.model.Episodio;
import br.com.balaiopodcast.balaiopodcast.service.EpisodioService;

@RestController
@RequestMapping("episodios")
public class EpisodioController {
	
	@Autowired
	private EpisodioService service;
	
	@GetMapping
	public ResponseEntity<List<Episodio>> listAll() {
		return new ResponseEntity<List<Episodio>>(service.getAll(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Episodio> save(@RequestBody EpisodioDto episodioDto) {
		service.save(episodioDto);
		return new ResponseEntity<Episodio>(HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Episodio> getById(@PathVariable Integer id) {
		return new ResponseEntity<Episodio>(service.getById(id), HttpStatus.OK);
	}
}
