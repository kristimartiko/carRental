package com.example.rent.core.repository;

import com.example.rent.core.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Long, Price> {
}
