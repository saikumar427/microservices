package com.sai.microservices.netfixzuulapiserver;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

  Logger logger = LoggerFactory.getLogger(this.getClass());
  @Override
  public Object run() throws ZuulException {
   HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
   logger.info("request Object {}, request URL {}", request, request.getRequestURI());
    return null;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public String filterType() {
    return "pre"; 
  }

}
