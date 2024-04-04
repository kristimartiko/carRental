package com.example.rent.core.repository;

import com.example.rent.core.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Long, Car> {
}
