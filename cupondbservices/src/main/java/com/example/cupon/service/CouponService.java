package com.example.cupon.service;



import java.util.Optional;

import com.example.cupon.model.Cupon;

public interface CouponService {
	public Optional<Cupon> getCoupon(String client);
	public Cupon addCupon(Cupon cupon) ;
	public Cupon updateCupon(Cupon cupon);
	public Optional<Cupon> deleteCupon(String client);
		
	}

