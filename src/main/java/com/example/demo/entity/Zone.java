package com.example.demo.entity;

import java.time.LocalDate;

public class Zone{
    
    private Integer id;
    private String zonename;
    private Integer priorityLevel;
    private Integer population;
    private Boolean active;
    private LocalDate createdAt;
    private LocalDate updateAt;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getZonename() {
        return zonename;
    }
    public void setZonename(String zonename) {
        this.zonename = zonename;
    }
    public Integer getPriorityLevel() {
        return priorityLevel;
    }
    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
    public Integer getPopulation() {
        return population;
    }
    public void setPopulation(Integer population) {
        this.population = population;
    }
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public LocalDate getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDate getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }
    public Zone(Integer id, String zonename, Integer priorityLevel, Integer population, Boolean active,
            LocalDate createdAt, LocalDate updateAt) {
        this.id = id;
        this.zonename = zonename;
        this.priorityLevel = priorityLevel;
        this.population = population;
        this.active = active;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    } 

    
}