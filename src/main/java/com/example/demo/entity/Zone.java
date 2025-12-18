package com.example.demo.entity;

import java.security.Timestamp;

public class Zone{
    @Id
    private Long id;
    @Column(unique=true)
    private String zonename;
    private Integer priorityLevel;
    private Integer population;
    private Boolean active;
    private Timestamp createdAt;
    private Timestamp updateAt;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
    public Timestamp getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }
    public Zone(Long id, String zonename, Integer priorityLevel, Integer population, Boolean active,
            Timestamp createdAt, Timestamp updateAt) {
        this.id = id;
        this.zonename = zonename;
        this.priorityLevel = priorityLevel;
        this.population = population;
        this.active = active;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    } 

    
}