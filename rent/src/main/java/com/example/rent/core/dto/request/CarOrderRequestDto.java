package com.example.rent.core.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class CarOrderRequestDto {
    private LocalDateTime pickupDate;
    private LocalDateTime dropDate;
    private Long carId;
}
