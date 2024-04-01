package com.example.rent.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

@Entity
public class CarOrder extends Auditable {

    @ManyToOne
    @JoinColumn(name = "price_id")
    @NotEmpty(message = "Price must not be null!")
    private Price price;

    @Column(name = "pickupDate")
    @NotEmpty(message = "Pickup date must not be null!")
    private LocalDateTime pickupDate;

    @Column(name = "dropDate")
    @NotEmpty LocalDateTime dropDate;
}
