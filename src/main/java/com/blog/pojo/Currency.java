package com.blog.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
@Table(name = "Currency")
@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @JsonProperty("code")
    @Column(name = "code", nullable = false)
    private String code;
    
    @JsonProperty("symbol")
    @Column(name = "symbol", nullable = false)
    private String symbol;
    
    @JsonProperty("rate")
    @Column(name = "rate", nullable = false)
    private String rate;
    
    @JsonProperty("description")
    @Column(name = "description", nullable = false)
    private String description;
    
    @JsonProperty("rate_float")
    @Column(name = "rate_float", nullable = false)
    private String rate_float;
    
}