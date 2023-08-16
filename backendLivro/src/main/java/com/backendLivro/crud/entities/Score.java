package com.backendLivro.crud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String scorevalue;
	
	public Score() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScorevalue() {
		return scorevalue;
	}

	public void setName(String scorevalue) {
		this.scorevalue = scorevalue;
	}
	
	
}
