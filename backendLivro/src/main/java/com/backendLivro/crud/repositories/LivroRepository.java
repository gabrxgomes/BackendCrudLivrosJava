package com.backendLivro.crud.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendLivro.crud.entities.Categoria;
import com.backendLivro.crud.entities.Livro;
import com.backendLivro.crud.entities.Score;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	List<Livro> findByScorevalue(Score scorevalue);

	List<Livro> findByCategorianome(Categoria categorianome);

	void deleteById(Score scorevalue);

	
}