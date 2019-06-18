package com.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.post.LocationRewriteFilter;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ReverseProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseProxyApplication.class, args);
	}

	@Bean
	public LocationRewriteFilter locationRewriteFilter(){
		return new LocationRewriteFilter();
	}

}
