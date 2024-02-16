package com.anime.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anime.project.domain.Anime;
import com.anime.project.interfaces.IAnimeService;
import com.anime.project.repository.AnimeRepository;

@Service
public class AnimeService implements IAnimeService {
	
	@Autowired
	private AnimeRepository animeRepositorty;

	@Override
	public List<Anime> listarAnimes() {
		return this.animeRepositorty.findAll();
	}

	@Override
	public Anime obterAnime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Anime salvarAnime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Anime atualizarAnime() {
		// TODO Auto-generated method stub
		return null;
	}
	
	 

}
