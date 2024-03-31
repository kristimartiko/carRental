package com.example.rent.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Price extends BaseEntity {

    @Column(name = "amount")
    @NotEmpty(message = "Amount must not be empty!")
    private double amount;

    @Column(name = "amountValut")
    @NotEmpty(message = "Amount Valut must not be empty!")
    private String amountValut;

    @Column(name = "startDateTime")
    @NotEmpty(message = "Start Date must not be empty!")
    private LocalDateTime startDateTime;

    @Column(name = "endDateTime")
    private LocalDateTime endDateTime;

    @ManyToOne
    @JoinColumn(name = "car_id")
    @NotEmpty(message = "Car must not be null!")
    private Car car;
}
