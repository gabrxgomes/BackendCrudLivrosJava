package com.backendLivro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendLivro.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
