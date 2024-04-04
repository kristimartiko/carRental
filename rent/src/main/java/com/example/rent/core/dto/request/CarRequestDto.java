package com.example.rent.core.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarRequestDto {
    private String model;
    private String make;
    private String description;
    private int quantity;
}
