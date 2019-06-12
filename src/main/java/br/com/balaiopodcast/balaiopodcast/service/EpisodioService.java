package br.com.balaiopodcast.balaiopodcast.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.balaiopodcast.balaiopodcast.dto.EpisodioDto;
import br.com.balaiopodcast.balaiopodcast.exceptions.NotFoundException;
import br.com.balaiopodcast.balaiopodcast.mapper.EpisodioMapper;
import br.com.balaiopodcast.balaiopodcast.model.Episodio;
import br.com.balaiopodcast.balaiopodcast.repository.EpisodioRepository;

@Service
public class EpisodioService {
	
	private EpisodioRepository episodioRepository;

	@Autowired
	public EpisodioService(EpisodioRepository episodioRepository) {
		super();
		this.episodioRepository = episodioRepository;
	}

	public List<Episodio> getAll() {
		return episodioRepository.findAll();
	}
	
	public void save(EpisodioDto dto) {
		episodioRepository.save(EpisodioMapper.mapper(dto));
	}

	public Episodio getById(Integer id) {
		return episodioRepository.findById(id).orElseThrow(() -> NotFoundException.build("Episodio não encontrado!"));
	}
}
