package com.sai.microservices.currencyconvertionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConverterController {
	
	@GetMapping("currency-convert/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConvert convert(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		Map<String, String> variable = new HashMap<>();
		variable.put("from", from);
		variable.put("to", to);
		CurrencyConvert response =  new RestTemplate().getForObject(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", 
				CurrencyConvert.class,
				variable
				);
		
		return new CurrencyConvert(
				response.getId(), 
				from,
				to,
				response.getConvertionMultiple(),
				response.getConvertionMultiple().multiply(quantity),
				response.getPort()
				);
		
	}

}
