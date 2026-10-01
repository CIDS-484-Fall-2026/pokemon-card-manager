package com.mason.pokemoncardmanager.controller;

import com.mason.pokemoncardmanager.model.PokemonCard;
import com.mason.pokemoncardmanager.service.PokemonCardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    private final PokemonCardService pokemonCardService;

    public CardController(PokemonCardService pokemonCardService) {
        this.pokemonCardService = pokemonCardService;
    }

    // Returns all cards
    @GetMapping
    public List<PokemonCard> getCards() {
        return List.of(
                new PokemonCard(
                        1L,
                        "Charizard",
                        "Base Set",
                        "4/102",
                        "Rare Holo"
                ),
                new PokemonCard(
                        2L,
                        "Pikachu",
                        "Base Set",
                        "58/102",
                        "Common"
                ),
                new PokemonCard(
                        3L,
                        "Blastoise",
                        "Base Set",
                        "2/102",
                        "Rare Holo"
                )
        );
    }

    // Returns one card based on its ID
    @GetMapping("/{id}")
    public PokemonCard getCardById(@PathVariable Long id) {

        if (id == 1) {
            return new PokemonCard(
                    1L,
                    "Charizard",
                    "Base Set",
                    "4/102",
                    "Rare Holo"
            );
        }

        if (id == 2) {
            return new PokemonCard(
                    2L,
                    "Pikachu",
                    "Base Set",
                    "58/102",
                    "Common"
            );
        }

        if (id == 3) {
            return new PokemonCard(
                    3L,
                    "Blastoise",
                    "Base Set",
                    "2/102",
                    "Rare Holo"
            );
        }

        return null;
    }

    // Searches for real cards using the Pokemon TCG API
    @GetMapping("/search")
    public String searchCards(@RequestParam String name) {
        return pokemonCardService.searchCards(name);
    }
}