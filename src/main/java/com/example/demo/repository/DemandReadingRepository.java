package com.example.demo.repository;

import com.example.demo.entity.DemandReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface DemandReadingRepository extends JpaRepository<DemandReading, Long> {
    // Used for latest reading per zone
    Optional<DemandReading> findFirstByZoneIdOrderByRecordedAtDesc(Long zoneId);
    
    // Used for history lists and recent limit readings
    List<DemandReading> findByZoneIdOrderByRecordedAtDesc(Long zoneId);
}