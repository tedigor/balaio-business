package br.com.balaiopodcast.balaiopodcast.mapper;

import br.com.balaiopodcast.balaiopodcast.dto.EpisodioDto;
import br.com.balaiopodcast.balaiopodcast.model.Episodio;

public class EpisodioMapper {
	
	public static Episodio mapper(EpisodioDto dto) {
		return new Episodio(dto.getNome(), dto.getCategoria(), dto.getDescricao(), dto.getUrlEpisodio());
	}
	
	public static EpisodioDto mapper(Episodio episodio) {
		return new EpisodioDto(episodio.getNome(), episodio.getCategoria(), episodio.getDescricao(), episodio.getUrlEpisodio());
	}
}
