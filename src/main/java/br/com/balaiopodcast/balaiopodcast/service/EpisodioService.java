package br.com.balaiopodcast.balaiopodcast.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.balaiopodcast.balaiopodcast.dto.EpisodioDtoEntrada;
import br.com.balaiopodcast.balaiopodcast.dto.EpisodioDtoSaida;
import br.com.balaiopodcast.balaiopodcast.exceptions.NotFoundException;
import br.com.balaiopodcast.balaiopodcast.mapper.EpisodioMapper;
import br.com.balaiopodcast.balaiopodcast.model.Episodio;
import br.com.balaiopodcast.balaiopodcast.repository.EpisodioRepository;
import br.com.balaiopodcast.balaiopodcast.specifications.EpisodiosSpecification;

@Service
public class EpisodioService {

	private EpisodioRepository episodioRepository;

	@Autowired
	public EpisodioService(EpisodioRepository episodioRepository) {
		this.episodioRepository = episodioRepository;
	}

	public List<EpisodioDtoSaida> getAll() {
		return episodioRepository.findAll().stream().map(EpisodioMapper::mapper).collect(Collectors.toList());
	}

	public void save(EpisodioDtoEntrada dto) {
		episodioRepository.save(EpisodioMapper.mapper(dto));
	}

	public Episodio getById(Integer id) {
		
		return episodioRepository.findById(id).orElseThrow(() -> NotFoundException.build("Episodio não encontrado!"));
	}

	public List<EpisodioDtoSaida> findBySpecification(String nomeEpisodio, String categoria) {
		return episodioRepository.findAll(EpisodiosSpecification.byFilter(nomeEpisodio, categoria)).stream()
				.map(EpisodioMapper::mapper).collect(Collectors.toList());
	}
	
	public void deleteById(Integer id) {
		Episodio episodio = getById(id);
		
		episodio.setExclusaoLogica(true);
		episodioRepository.save(episodio);
	}
}
