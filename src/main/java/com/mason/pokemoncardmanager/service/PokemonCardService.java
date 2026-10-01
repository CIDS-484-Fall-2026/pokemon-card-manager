package com.mason.pokemoncardmanager.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PokemonCardService {

    private final RestClient restClient;

    public PokemonCardService() {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.pokemontcg.io/v2")
                .defaultHeader("User-Agent", "PokemonCardManager/1.0")
                .build();
    }

    public String searchCards(String name) {

        return restClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/cards")
                        .queryParam("q", "name:" + name)
                        .queryParam("pageSize", 5)
                        .build())
                .retrieve()
                .body(String.class);
    }
}