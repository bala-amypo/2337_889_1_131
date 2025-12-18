package com.example.demo.entity;

import java.time.LocalDate;

public class AppUser{
     private Integer id;
     private LocalDate restoredAt;
     private Long eventId;
     private String notes;

     public AppUser(Integer id, LocalDate restoredAt, Long eventId, String notes) {
        this.id = id;
        this.restoredAt = restoredAt;
        this.eventId = eventId;
        this.notes = notes;
     }

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
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