package com.blog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.Service.CoinDeskService;
import com.blog.Service.CurrencyService;
import com.blog.pojo.Currency;

@RestController
@RequestMapping("/api/currency")
public class BitcoinController {
	
	private final CoinDeskService coinDeskService;
	
	@Autowired
	private CurrencyService currencyService;

    @Autowired
    public BitcoinController(CoinDeskService coinDeskService) {
        this.coinDeskService = coinDeskService;
    }

    @GetMapping("/price")
    public String getBitcoinPrice() {
       return coinDeskService.getCurrentBitcoinPrice();
    }
    
    @PostMapping("getAllCurrencies")
    public List<Currency> getAllCurrencies(){
		return currencyService.getAllCurrencies();
    
    	}
    }
