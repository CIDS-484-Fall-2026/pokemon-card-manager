package com.mason.pokemoncardmanager.controller;

import com.mason.pokemoncardmanager.model.PokemonCard;
import com.mason.pokemoncardmanager.repository.PokemonCardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CollectionController {

    private final PokemonCardRepository cardRepository;

    // Connects the controller to the repository for accessing saved cards.
    public CollectionController(PokemonCardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    // Retrieves saved cards and displays them on the collection webpage.
    @GetMapping("/collection")
    public String showCollection(Model model) {
        model.addAttribute("cards", cardRepository.findAll());
        return "collection";
    }

    // Displays the form for adding a new Pokemon card.
    @GetMapping("/collection/add")
    public String showAddCardForm() {
        return "add-card";
    }

    // Saves the submitted card to Oracle and returns to the collection.
    @PostMapping("/collection/add")
    public String addCard(@ModelAttribute PokemonCard card) {
        card.setId(null);
        cardRepository.save(card);
        return "redirect:/collection";
    }
}
