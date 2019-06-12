package br.com.balaiopodcast.balaiopodcast.dto;

public class EpisodioDto {

	private String nome;

	private String categoria;

	private String descricao;

	private String urlEpisodio;

	public EpisodioDto(String nome, String categoria, String descricao, String urlEpisodio) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
		this.urlEpisodio = urlEpisodio;
	}

	public EpisodioDto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrlEpisodio() {
		return urlEpisodio;
	}

	public void setUrlEpisodio(String urlEpisodio) {
		this.urlEpisodio = urlEpisodio;
	}
	
	

}
