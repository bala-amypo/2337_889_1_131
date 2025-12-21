Zone zone = zoneService.getZoneById(id);
ZoneDTO dto = new ZoneDTO(zone.getId(), zone.getName(),
                          zone.getPriorityLevel(), zone.isActive());
return ResponseEntity.ok(dto);
