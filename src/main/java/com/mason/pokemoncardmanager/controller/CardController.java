package com.mason.pokemoncardmanager.controller;

import com.mason.pokemoncardmanager.model.PokemonCard;
import com.mason.pokemoncardmanager.repository.PokemonCardRepository;
import com.mason.pokemoncardmanager.service.PokemonCardService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    private final PokemonCardService pokemonCardService;
    private final PokemonCardRepository pokemonCardRepository;

    public CardController(PokemonCardService pokemonCardService,
                          PokemonCardRepository pokemonCardRepository) {
        this.pokemonCardService = pokemonCardService;
        this.pokemonCardRepository = pokemonCardRepository;
    }

    // Returns all cards saved in the Oracle database
    @GetMapping
    public List<PokemonCard> getCards() {
        return pokemonCardRepository.findAll();
    }

    // Returns one saved card based on its database ID
    @GetMapping("/{id}")
    public PokemonCard getCardById(@PathVariable Long id) {
        return pokemonCardRepository.findById(id).orElse(null);
    }

    // Searches for real cards using the Pokemon TCG API
    @GetMapping("/search")
    public String searchCards(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String set) {

        return pokemonCardService.searchCards(name, set);
    }

    // Saves a Pokemon card to the Oracle database
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PokemonCard saveCard(@RequestBody PokemonCard card) {
        card.setId(null);
        return pokemonCardRepository.save(card);
    }

    // Deletes a saved Pokemon card from the Oracle database
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCard(@PathVariable Long id) {
        pokemonCardRepository.deleteById(id);
    }

    // Updates an existing Pokemon card in the Oracle database
    @PutMapping("/{id}")
    public PokemonCard updateCard(@PathVariable Long id,
                                  @RequestBody PokemonCard updatedCard) {

        PokemonCard card = pokemonCardRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Card not found"));

        card.setName(updatedCard.getName());
        card.setSetName(updatedCard.getSetName());
        card.setCardNumber(updatedCard.getCardNumber());
        card.setRarity(updatedCard.getRarity());

        return pokemonCardRepository.save(card);
    }
}
