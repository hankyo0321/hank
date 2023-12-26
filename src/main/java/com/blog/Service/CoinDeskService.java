package com.blog.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientSsl;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CoinDeskService {

    @Value("${coindesk.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public CoinDeskService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCurrentBitcoinPrice() {
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
