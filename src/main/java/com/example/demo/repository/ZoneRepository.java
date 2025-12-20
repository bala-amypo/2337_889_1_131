package com.example.demo.repository;

import com.example.demo.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long> {
    // Used for uniqueness checks
    Optional<Zone> findByZoneName(String zoneName);
    
    // Used by LoadSheddingService to find candidate zones
    List<Zone> findByActiveTrueOrderByPriorityLevelAsc();
}