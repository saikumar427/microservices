package com.sai.microservices.limitservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

	@Autowired
	private LimitValues limits;
	@GetMapping("/limits")
	public LimitValues getLimits(Boolean flag) {
	  System.out.println("########################################## "+flag);
		return limits;
	}
	
	@GetMapping("/get/{flag}")
	@HystrixCommand(fallbackMethod="getLimits")
	public LimitValues get(@PathVariable Boolean flag) {
	  if(flag)
	    throw new NullPointerException("Exception occured .....");
	  return new LimitValues(125,985);
	}
	
}
