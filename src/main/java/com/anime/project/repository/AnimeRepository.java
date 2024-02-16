package com.anime.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anime.project.domain.Anime;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long>{
	
}
