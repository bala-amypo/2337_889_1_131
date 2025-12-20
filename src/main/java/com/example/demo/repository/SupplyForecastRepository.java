package com.example.demo.repository;

import com.example.demo.entity.SupplyForecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface SupplyForecastRepository extends JpaRepository<SupplyForecast, Long> {
    // Used to trigger load shedding based on the newest data
    Optional<SupplyForecast> findFirstByOrderByGeneratedAtDesc();
}