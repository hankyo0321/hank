package com.blog.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CoinDeskService {

    @Value("${coindesk.api.url}")
    private String apiUrl;

    private  RestTemplate restTemplate;
    
    @Autowired
    public CoinDeskService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCurrentBitcoinPrice() {
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
