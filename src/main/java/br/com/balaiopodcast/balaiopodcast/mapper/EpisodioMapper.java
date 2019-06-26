package br.com.balaiopodcast.balaiopodcast.mapper;

import java.util.Date;

import br.com.balaiopodcast.balaiopodcast.dto.EpisodioDtoEntrada;
import br.com.balaiopodcast.balaiopodcast.dto.EpisodioDtoSaida;
import br.com.balaiopodcast.balaiopodcast.model.Episodio;

public class EpisodioMapper {

	public static Episodio mapper(EpisodioDtoSaida dto) {
		return new Episodio(dto.getId(), dto.getNome(), dto.getCategoria(), dto.getDescricao(), dto.getUrlEpisodio(),
				new Date(dto.getDataLancamento()));
	}

	public static Episodio mapper(EpisodioDtoEntrada dto) {
		return new Episodio(dto.getNome(), dto.getCategoria(), dto.getDescricao(), dto.getUrlEpisodio(),
				new Date(dto.getDataLancamento()));
	}

	public static EpisodioDtoSaida mapper(Episodio episodio) {
		return new EpisodioDtoSaida(episodio.getId(), episodio.getNome(), episodio.getCategoria(),
				episodio.getDescricao(), episodio.getUrlEpisodio(), episodio.getDataLancamento().getTime());
	}
}
