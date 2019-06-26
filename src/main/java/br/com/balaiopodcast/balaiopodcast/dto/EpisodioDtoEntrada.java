package br.com.balaiopodcast.balaiopodcast.dto;

public class EpisodioDtoEntrada extends EpisodioDto {

	public EpisodioDtoEntrada() {
	}

	public EpisodioDtoEntrada(String nome, String categoria, String descricao, String urlEpisodio,
			Long dataLancamento) {
		super(nome, categoria, descricao, urlEpisodio, dataLancamento);
	}

}
