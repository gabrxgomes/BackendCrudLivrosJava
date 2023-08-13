package com.backendLivro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendLivro.entities.Livro;
import com.backendLivro.repositories.LivroRepository;

@RestController
@RequestMapping(value = "/livros")
public class livroController {
	
	@Autowired
	private LivroRepository repository;
	
	@GetMapping
	public List<Livro> findAll () {
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Livro findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Livro insert(@RequestBody Livro livro) {
		return repository.save(livro);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removerLivro(@PathVariable Long id) {
	    repository.deleteById(id);
	    return ResponseEntity.noContent().build();
	}
	

}
