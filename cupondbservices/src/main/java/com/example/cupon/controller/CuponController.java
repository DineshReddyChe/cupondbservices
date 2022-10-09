package com.example.cupon.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cupon.model.Cupon;
import com.example.cupon.model.WebTelemedicine;
import com.example.cupon.service.CouponService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//http://localhost:8891/getcoupon/1234

@RestController
@RequestMapping("/coupon")
@Validated
public class CuponController {
@Autowired
CouponService couponService;
//private static final Logger LOGGER=LoggerFactory.getLogger(CuponController.class);


@GetMapping("/getcoupon/{client}")
public ResponseEntity<Optional<Cupon>> cuponPath(@PathVariable(name="client") String client, 
		@RequestHeader(name = "AppToken") String appToken){
//	LOGGER.error("getCoupon method started  client: {}", client);
//	LOGGER.info("getCoupon method   AppToken: {}", appToken);
//	LOGGER.error("getMethod:{}", client);
	Optional<Cupon> cupon=couponService.getCoupon(client);
	MultiValueMap<String, String> header= new LinkedMultiValueMap<>();
	header.add("AppToken", "appToken");
	System.out.println("update");
	ResponseEntity<Optional<Cupon>> response = new ResponseEntity<Optional<Cupon>>(cupon, header, HttpStatus.OK);
	return response;
	}
@PostMapping("/addcoupon")
public ResponseEntity<Cupon> addCoupon(@RequestBody Cupon cupon,
		@RequestHeader(name = "AppToken") String appToken) {

	Cupon couponresult = couponService.addCupon(cupon);

	MultiValueMap<String, String> hearder = new LinkedMultiValueMap<>();
	hearder.add("AppToken", appToken);
	ResponseEntity<Cupon> response = new ResponseEntity<Cupon>(couponresult, hearder,
			HttpStatus.OK);
	return response;
}
@PutMapping("/updateCupon")
public ResponseEntity<Cupon> updateCupon(@RequestBody Cupon cupon,
		@RequestHeader(name="AppToken") String appToken){
	Cupon couponresult = couponService.updateCupon(cupon);
	MultiValueMap<String, String> hearder = new LinkedMultiValueMap<>();
	hearder.add("AppToken", appToken);
	ResponseEntity<Cupon> response = new ResponseEntity<Cupon>(couponresult, hearder,
			HttpStatus.OK);
			return response;
	
}
@DeleteMapping("/deletecoupon/{client}")
public ResponseEntity<Optional<Cupon>> deleteCupon(@PathVariable(name="client") String client, 
		@RequestHeader(name = "AppToken") String appToken){
	Optional<Cupon> cupon=couponService.deleteCupon(client);
	MultiValueMap<String, String> header= new LinkedMultiValueMap<>();
	header.add("AppToken", "appToken");
	ResponseEntity<Optional<Cupon>> response = new ResponseEntity<Optional<Cupon>>(cupon, header, HttpStatus.OK);
	return response;
	}
//
//@RequestMapping(value = "/byEncounterId/{encounterId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//public ResponseEntity<WebTelemedicine> getByEncounterId(@PathVariable Long encounterId) {
//    WebTelemedicine teleMedicine = couponService.loadByEncounterId(encounterId);
//    return ResponseEntity.ok(teleMedicine);
}
