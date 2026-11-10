
package com.mason.pokemoncardmanager.controller;

import com.mason.pokemoncardmanager.repository.PokemonCardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
