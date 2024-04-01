package com.example.rent.core.enumeration;

import lombok.Getter;

@Getter
public enum SuccessResponseDescription {
    CAR_CREATED("Car successfully created."),
    ADMIN_LOG_IN("Admin logged in.");
    private final String value;

    SuccessResponseDescription(String value) { this.value = value; }
}
