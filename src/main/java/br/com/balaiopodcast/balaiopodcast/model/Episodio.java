package br.com.balaiopodcast.balaiopodcast.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "episodios")
@SequenceGenerator(name = "seq_episodio", sequenceName = "seq_episodio", initialValue = 1, allocationSize = 1)
public class Episodio implements Serializable {

	private static final long serialVersionUID = -8659956569893470375L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_episodio")
	@Column(name = "id_episodio", nullable = false)
	private Integer id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "categoria", nullable = false)
	private String categoria;

	@Column(name = "descricao", nullable = false)
	private String descricao;

	@Column(name = "url_episodio", nullable = false)
	private String urlEpisodio;

	@Column(name = "exclusao_logica", nullable = false)
	private Boolean exclusaoLogica = false;

	@Column(name = "data_lancamento", nullable = false)
	private Date dataLancamento;

	

	public Episodio(Integer id, String nome, String categoria, String descricao, String urlEpisodio, Date dataLancamento) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
		this.urlEpisodio = urlEpisodio;
		this.dataLancamento = dataLancamento;
	}
	
	public Episodio(String nome, String categoria, String descricao, String urlEpisodio, Date dataLancamento) {
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
		this.urlEpisodio = urlEpisodio;
		this.dataLancamento = dataLancamento;
	}
	

	public Episodio() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getUrlEpisodio() {
		return urlEpisodio;
	}

	public void setUrlEpisodio(String urlEpisodio) {
		this.urlEpisodio = urlEpisodio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getExclusaoLogica() {
		return exclusaoLogica;
	}

	public void setExclusaoLogica(Boolean exclusaoLogica) {
		this.exclusaoLogica = exclusaoLogica;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

}
