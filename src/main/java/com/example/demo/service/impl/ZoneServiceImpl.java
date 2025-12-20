package com.example.demo.service.impl;

import com.example.demo.entity.Zone;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.service.ZoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ZoneServiceImpl implements ZoneService {
    
    private final ZoneRepository zoneRepository;

    @Override
    public List<Zone> getAllZones() {
        return zoneRepository.findAll();
    }
    
    // Add other methods (create, delete, etc.) here
}