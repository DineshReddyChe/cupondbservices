package com.example.cupon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cupon.model.Cupon;

public interface CouponRepository extends JpaRepository<Cupon, String> {

}
