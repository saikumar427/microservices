package com.sai.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeValueRepository exrepo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue exchangeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue exv = exrepo.findByfromAndTo(from, to);
		exv.setPort(env.getProperty("server.port"));
		return exv;
	}
}

@Configuration
class Beans{
	@Bean
	public ExchangeValue getValue() {
		return new ExchangeValue(1l,"","",BigDecimal.valueOf(30.00));
	}
}