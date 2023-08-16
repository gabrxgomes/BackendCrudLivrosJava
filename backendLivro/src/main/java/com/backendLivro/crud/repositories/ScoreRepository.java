package com.backendLivro.crud.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendLivro.crud.entities.Categoria;
import com.backendLivro.crud.entities.Livro;
import com.backendLivro.crud.entities.Score;

public interface ScoreRepository extends JpaRepository<Livro, Long> {
	
	List<Livro> findByScorevalue(Score scorevalue);

	List<Livro> findByCategorianome(Categoria categorianome);

	static Score save(Score score) {
		// TODO Auto-generated method stub
		return null;
	}

	static void delete(Score score) {
		// TODO Auto-generated method stub
		
	}

	
}