package com.example.demo.entity;


import java.time.LocalDate;

public class DemandReading {
    @Id
    private Long id;
    private Double demandMW;
    private LocalDate recordedAt;

    
    public DemandReading(Long id, Double demandMW, LocalDate recordedAt) {
        this.id = id;
        this.demandMW = demandMW;
        this.recordedAt = recordedAt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getDemandMW() {
        return demandMW;
    }
    public void setDemandMW(Double demandMW) {
        this.demandMW = demandMW;
    }
    public LocalDate getRecordedAt() {
        return recordedAt;
    }
    public void setRecordedAt(LocalDate recordedAt) {
        this.recordedAt = recordedAt;
    }


}