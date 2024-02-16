package com.anime.project.interfaces;

import java.util.List;

import com.anime.project.domain.Anime;

public interface IAnimeService {
	List<Anime> listarAnimes();
	Anime obterAnime();
	Anime salvarAnime();
	Anime atualizarAnime();
}
