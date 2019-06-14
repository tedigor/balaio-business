package br.com.balaiopodcast.balaiopodcast.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.balaiopodcast.balaiopodcast.model.Episodio;

@Repository
public interface EpisodioRepository extends JpaRepository<Episodio, Integer> {
	
	@Query(nativeQuery = true, value = "SELECT e.nome FROM episodios e WHERE e.nome LIKE '%:nome%'")
	Episodio findByNome(String nome);
	
	@Query(nativeQuery = true, value = "SELECT * FROM episodios e WHERE e.exclusao_logica = false")
	List<Episodio> findAll();
}
