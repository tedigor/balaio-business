package br.com.balaiopodcast.balaiopodcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.balaiopodcast.balaiopodcast.dto.EpisodioDtoEntrada;
import br.com.balaiopodcast.balaiopodcast.dto.EpisodioDtoSaida;
import br.com.balaiopodcast.balaiopodcast.mapper.EpisodioMapper;
import br.com.balaiopodcast.balaiopodcast.model.Episodio;
import br.com.balaiopodcast.balaiopodcast.service.EpisodioService;

@RestController
@RequestMapping("episodios")
public class EpisodioController {

	@Autowired
	private EpisodioService service;

	@GetMapping
	public ResponseEntity<List<EpisodioDtoSaida>> listAll() {
		return new ResponseEntity<List<EpisodioDtoSaida>>(service.getAll(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Episodio> save(@RequestBody EpisodioDtoEntrada episodioDto) {
		service.save(episodioDto);
		return new ResponseEntity<Episodio>(HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<EpisodioDtoSaida> getById(@PathVariable Integer id) {
		return new ResponseEntity<EpisodioDtoSaida>(EpisodioMapper.mapper(service.getById(id)), HttpStatus.OK);
	}

	@GetMapping("list")
	public ResponseEntity<List<EpisodioDtoSaida>> getByNome(@RequestParam(name = "nomeEpisodio") String nomeEpisodio,
			@RequestParam(name = "categoria") String categoria) {
		return new ResponseEntity<List<EpisodioDtoSaida>>(service.findBySpecification(nomeEpisodio, categoria),
				HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Episodio> delete(@PathVariable Integer id) {
		service.deleteById(id);
		return new ResponseEntity<Episodio>(HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Episodio> edit(@PathVariable Integer id, @RequestBody EpisodioDtoEntrada dto) {
		service.editEpisodio(id, dto);
		return new ResponseEntity<Episodio>(HttpStatus.OK);
	}
}
