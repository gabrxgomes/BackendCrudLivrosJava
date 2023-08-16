package com.backendLivro.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendLivro.crud.entities.Categoria;
import com.backendLivro.crud.entities.Livro;
import com.backendLivro.crud.entities.Score;
import com.backendLivro.crud.repositories.LivroRepository;
import com.backendLivro.crud.repositories.ScoreRepository;

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
	//-------------------------------------------------------------
	//------------------ SCORE
	
	
	@GetMapping(value = "/por-score/{scoreId}")
    public List<Livro> findByScore(@PathVariable Long scoreId) {
        Score scorevalue = new Score();
        scorevalue.setId(scoreId);
        return repository.findByScorevalue(scorevalue);
    }
	
	@PostMapping("/scores")
	public ResponseEntity<Score> createScore(@RequestBody Score scoreId) {
	    Score newScore = ScoreRepository.save(scoreId);
	    return ResponseEntity.status(HttpStatus.CREATED).body(newScore);
	}
	
	/*@DeleteMapping("/por-score/{scoreId}")
	public ResponseEntity<Void> deleteScore(@PathVariable Long scoreId) {
		Optional<Score> scoreOptional = ScoreRepository.findById(scoreId);
		
		
		
	    if (scoreOptional.isPresent()) {
	        Score score = scoreOptional.get();
	        ScoreRepository.delete(score);
	        return ResponseEntity.noContent().build();
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	*/

	@DeleteMapping("/por-score/{scoreId}")
	public ResponseEntity<Void> deleteScore(@PathVariable Long scoreId) {
	    Optional<Score> scoreOptional = Optional.empty();

	    if (scoreOptional.isPresent()) {
	        Score scorevalue = scoreOptional.get();
	        repository.deleteById(scoreId);
	        return ResponseEntity.noContent().build();
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	
	
	
	
	//---------------------------------------------------------------
	
	@GetMapping(value = "/por-categoria/{categoriaId}")
    public List<Livro> findByCategorianome(@PathVariable Long categoriaId) {
        Categoria categorianome = new Categoria();
        categorianome.setId(categoriaId);
        return repository.findByCategorianome(categorianome);
    }
	
	
	//----------------------------------------------------------------
	
	

}