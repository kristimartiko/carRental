package com.example.rent.core.repository;

import com.example.rent.core.entity.CarOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarOrderRepository extends JpaRepository<Long, CarOrder> {
}
