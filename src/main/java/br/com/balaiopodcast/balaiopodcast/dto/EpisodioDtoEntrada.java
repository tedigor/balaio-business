package br.com.balaiopodcast.balaiopodcast.dto;

import java.util.Date;

public class EpisodioDtoEntrada extends EpisodioDto {

	public EpisodioDtoEntrada() {
	}

	public EpisodioDtoEntrada(String nome, String categoria, String descricao, String urlEpisodio,
			Date dataLancamento) {
		super(nome, categoria, descricao, urlEpisodio, dataLancamento);
	}

}
