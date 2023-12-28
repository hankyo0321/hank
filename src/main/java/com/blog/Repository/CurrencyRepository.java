package com.blog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.pojo.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
	
	
	Currency findByCode(String code);

}
