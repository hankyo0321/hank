package com.blog.pojo;
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
    private String updated;
    
    @JsonProperty("updatedISO")
    private String updatedISO;
    
    @JsonProperty("updateduk")
    private String updateduk;
    
    
    @JsonProperty("bpi")
    private String bpi;
    
    @JsonProperty("GBP")
    private String GBP;
    
    @JsonProperty("EUR")
    private String EUR;
    
}