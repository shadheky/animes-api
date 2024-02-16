package com.anime.project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="ANIME")
@Entity
public class Anime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome")
	private String name;
	@Column
	private String descricao;
	@Column(name = "qtd_epsodios")
	private Integer quantidadeEpsodios;

	public Anime(Long id, String name, String descricao, Integer quantidadeEpsodios) {
		this.id = id;
		this.name = name;
		this.descricao = descricao;
		this.quantidadeEpsodios = quantidadeEpsodios;
	}
	public Anime() {
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuantidadeEpsodios() {
		return quantidadeEpsodios;
	}
	public void setQuantidadeEpsodios(Integer quantidadeEpsodios) {
		this.quantidadeEpsodios = quantidadeEpsodios;
	}
	
	
	
}
