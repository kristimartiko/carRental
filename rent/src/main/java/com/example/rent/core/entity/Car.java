package com.example.rent.core.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class Car extends BaseEntity {
    @Column(name = "model")
    @NotEmpty(message = "Model must not be empty!")
    private String model;

    @Column(name = "make")
    @NotEmpty(message = "Make must not be empty!")
    private String make;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    @NotEmpty(message = "Quantity must not be null")
    private int quantity;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Price> prices;
}
