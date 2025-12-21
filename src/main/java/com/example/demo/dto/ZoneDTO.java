package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZoneDTO {
    private Long id;
    private String zoneName;
    private String description;
    private Boolean active;
    private Integer priorityLevel;
}