package com.anime.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anime.project.domain.Anime;
import com.anime.project.services.AnimeService;

@RestController
@RequestMapping("animes")
@CrossOrigin("*")
public class AnimeController {
	
	@Autowired
	private AnimeService animeService; 
	
	@GetMapping
	public ResponseEntity<List <Anime>> listarAnimes() {
		return ResponseEntity.ok(animeService.listarAnimes());
	}
}
