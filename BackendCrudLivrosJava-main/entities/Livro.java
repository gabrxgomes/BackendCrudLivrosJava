package com.backendLivro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tb_livro")

public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categorianome;
	
	
	@ManyToOne
	@JoinColumn(name = "score_id")
	
	
	private Score scorevalue;
	
	
	
	public Livro() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Categoria getCategoria() {
		return categorianome;
	}

	public void setCategoria(Categoria categorianome) {
		this.categorianome = categorianome;
	}

	public Score getScore() {
		return scorevalue;
	}

	public void setScore(Score scorevalue) {
		this.scorevalue = scorevalue;
	}
	
	
	
	
	

}
