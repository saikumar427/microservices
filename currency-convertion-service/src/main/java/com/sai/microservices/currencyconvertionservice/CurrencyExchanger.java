package com.sai.microservices.currencyconvertionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(url = "localhost:8000", name = "currency-exchange-service")
@FeignClient(name = "currency-exchange-service")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchanger {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConvert exchangeValue(@PathVariable String from, @PathVariable String to);
}
