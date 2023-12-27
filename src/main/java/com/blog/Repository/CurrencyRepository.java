package com.blog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.pojo.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
	
	
	Currency findByCode(String code);

}
