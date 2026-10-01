package com.mason.pokemoncardmanager.model;

public class PokemonCard {

    private Long id;
    private String name;
    private String setName;
    private String cardNumber;
    private String rarity;

    public PokemonCard(Long id, String name, String setName,
                       String cardNumber, String rarity) {
        this.id = id;
        this.name = name;
        this.setName = setName;
        this.cardNumber = cardNumber;
        this.rarity = rarity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSetName() {
        return setName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getRarity() {
        return rarity;
    }
}