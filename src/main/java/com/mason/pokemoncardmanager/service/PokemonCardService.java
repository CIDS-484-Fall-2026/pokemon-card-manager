
package com.mason.pokemoncardmanager.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

@Service
public class PokemonCardService {

    private final RestClient restClient;

    public PokemonCardService() {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.pokemontcg.io/v2")
                .defaultHeader("User-Agent", "PokemonCardManager/1.0")
                .build();
    }

    public String searchCards(String name, String set) {

        String query = "";

        // Search by Pokemon name
        if (name != null && !name.isBlank()) {
            query = "name:" + name;
        }

        // Search by exact set ID
        if (set != null && !set.isBlank()) {
            if (!query.isEmpty()) {
                query += " ";
            }
            query += "set.id:" + set;
        }

        String finalQuery = query;

        // Request card information from the Pokemon TCG API
        try {
            return restClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/cards")
                            .queryParam("q", finalQuery)
                            .queryParam("pageSize", 5)
                            .build())
                    .retrieve()
                    .body(String.class);

        } catch (RestClientResponseException e) {
            System.out.println("Pokemon TCG API error: " + e.getStatusCode());

            return "{\"error\":\"Unable to retrieve Pokemon cards right now. Please try again later.\"}";
        }
    }
}
