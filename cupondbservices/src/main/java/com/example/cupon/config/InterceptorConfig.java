package com.example.cupon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.cupon.utlity.LoggerInterceptor;
@Component
public class InterceptorConfig implements WebMvcConfigurer {
	@Autowired
	LoggerInterceptor inte;

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(inte).addPathPatterns("/coupon/addcoupon/*", "/coupon/getcoupon/*");
	}



}