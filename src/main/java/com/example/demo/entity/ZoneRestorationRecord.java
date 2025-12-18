package com.example.demo.entity;

import java.time.LocalDate;

public class ZoneRestorationRecord{
    @Id
    private Long id;
    private LocalDate restoredAt;
    private Long eventId;
    
    public ZoneRestorationRecord(Long id, LocalDate restoredAt, Long eventId, String notes) {
        this.id = id;
        this.restoredAt = restoredAt;
        this.eventId = eventId;
        this.notes = notes;
    }
    private String notes;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getRestoredAt() {
        return restoredAt;
    }
    public void setRestoredAt(LocalDate restoredAt) {
        this.restoredAt = restoredAt;
    }
    public Long getEventId() {
        return eventId;
    }
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
}