package com.pokemon.Pokemon.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String context;
    private int start;

    public Review(int id, String title, String context, int start) {
        this.id = id;
        this.title = title;
        this.context = context;
        this.start = start;
    }
}
