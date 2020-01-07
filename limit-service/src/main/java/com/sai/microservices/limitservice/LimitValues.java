package com.sai.microservices.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits.service")
public class LimitValues {

	private int minimum;
	private int maximum;
	
	/**
   * @param minimum
   * @param maximum
   */
	
  public LimitValues(int minimum, int maximum) {
    super();
    this.minimum = minimum;
    this.maximum = maximum;
  }
  /**
   * 
   */
  public LimitValues() {
    super();
  }
  public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
}
