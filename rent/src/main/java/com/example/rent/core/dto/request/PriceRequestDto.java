package com.example.rent.core.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PriceRequestDto {
    private double amount;
    private String amountValut;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Long carId;

}
