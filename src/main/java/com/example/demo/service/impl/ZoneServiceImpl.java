package com.example.demo.service.impl;

import com.example.demo.dto.ZoneDTO;
import com.example.demo.entity.Zone;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.service.ZoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ZoneServiceImpl implements ZoneService {

    private final ZoneRepository zoneRepository;

    @Override
    public List<ZoneDTO> getAllZones() {
        return zoneRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ZoneDTO createZone(ZoneDTO zoneDTO) {
        Zone zone = Zone.builder()
                .zoneName(zoneDTO.getZoneName())
                .priorityLevel(zoneDTO.getPriorityLevel())
                .population(zoneDTO.getPopulation())
                .active(true)
                .build();
        return mapToDTO(zoneRepository.save(zone));
    }

    @Override
    public void deactivateZone(Long id) {
        Zone zone = zoneRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Zone not found"));
        zone.setActive(false);
        zoneRepository.save(zone);
    }

    private ZoneDTO mapToDTO(Zone zone) {
        return ZoneDTO.builder()
                .id(zone.getId())
                .zoneName(zone.getZoneName())
                .priorityLevel(zone.getPriorityLevel())
                .population(zone.getPopulation())
                .active(zone.getActive())
                .build();
    }
}