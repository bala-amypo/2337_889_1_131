package com.example.demo.service;

import com.example.demo.dto.ZoneDTO;
import java.util.List;

public interface ZoneService {
    List<ZoneDTO> getAllZones();
    ZoneDTO createZone(ZoneDTO zoneDTO);
    void deactivateZone(Long id); // The method the compiler is complaining about
}
