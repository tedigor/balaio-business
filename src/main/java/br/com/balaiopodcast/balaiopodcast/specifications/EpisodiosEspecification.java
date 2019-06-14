package br.com.balaiopodcast.balaiopodcast.specifications;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import br.com.balaiopodcast.balaiopodcast.model.Episodio;

public class EpisodiosEspecification {

	public static Specification<Episodio> byFilter(String nomeEpisodio) {
		return new Specification<Episodio>() {

			@Override
			public Predicate toPredicate(Root<Episodio> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> predicates = new ArrayList<>();
				
				if (nomeEpisodio != null && !nomeEpisodio.isEmpty()) {
					predicates.add(criteriaBuilder.like(root.get("episodios").get("nome"), "%" + nomeEpisodio + "%"));
				}
				
				return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
	}
}
