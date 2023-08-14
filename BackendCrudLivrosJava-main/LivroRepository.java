package com.backendLivro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendLivro.entities.Categoria;
import com.backendLivro.entities.Livro;
import com.backendLivro.entities.Score;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	List<Livro> findByScorevalue(Score scorevalue);

	List<Livro> findByCategorianome(Categoria categorianome);

	//void delete(Score score);
}
