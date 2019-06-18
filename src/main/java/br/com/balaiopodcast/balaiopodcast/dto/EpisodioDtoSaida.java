package br.com.balaiopodcast.balaiopodcast.dto;

import java.util.Date;

public class EpisodioDtoSaida extends EpisodioDto {

	private Integer id;

	public EpisodioDtoSaida() {
	}

	public EpisodioDtoSaida(Integer id, String nome, String categoria, String descricao, String urlEpisodio,
			Date dataLancamento) {
		super(nome, categoria, descricao, urlEpisodio, dataLancamento);
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
