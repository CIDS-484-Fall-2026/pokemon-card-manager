package com.mason.pokemoncardmanager.repository;

import com.mason.pokemoncardmanager.model.PokemonCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonCardRepository extends JpaRepository<PokemonCard, Long> {
}
