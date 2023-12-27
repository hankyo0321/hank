package com.blog.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @JsonProperty("updated")
    @Column(name = "updated", nullable = false)
    private String updated;
    
    
    @JsonProperty("updatedISO")
    @Column(name = "updatedISO", nullable = false)
    private String updatedISO;
    
    @JsonProperty("updateduk")
    @Column(name = "updateduk", nullable = false)
    private String updateduk;
    
    
    @JsonProperty("bpi")
    @Column(name = "bpi", nullable = false)
    private String bpi;
    
    @JsonProperty("GBP")
    @Column(name = "GBP", nullable = false)
    private String GBP;
    
    @JsonProperty("EUR")
    @Column(name = "EUR", nullable = false)
    private String EUR;
    
}