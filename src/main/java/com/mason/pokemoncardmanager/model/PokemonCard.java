package com.mason.pokemoncardmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class PokemonCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String setName;
    private String cardNumber;
    private String rarity;

    // Stores the URL of the card's artwork.
    @Column(length = 1000)
    private String imageUrl;

    public PokemonCard() {
    }

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

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    // Returns the URL of the card's artwork.
    public String getImageUrl() {
        return imageUrl;
    }

    // Updates the URL of the card's artwork.
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
