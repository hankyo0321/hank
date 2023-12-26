package com.blog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.Service.CoinDeskService;

@RestController
@RequestMapping("/api/currency")
public class BitcoinController {
	
	private final CoinDeskService coinDeskService;

    @Autowired
    public BitcoinController(CoinDeskService coinDeskService) {
        this.coinDeskService = coinDeskService;
    }

    @GetMapping("/price")
    public String getBitcoinPrice() {
        return coinDeskService.getCurrentBitcoinPrice();
    }
	
}
