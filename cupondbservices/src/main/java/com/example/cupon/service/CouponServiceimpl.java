package com.example.cupon.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cupon.model.Cupon;
import com.example.cupon.model.Encounter;
import com.example.cupon.model.WebTelemedicine;
import com.example.cupon.repo.CouponRepository;
import com.example.cupon.repo.EncounterRepository;
import com.example.cupon.repo.TeleMedicienRepo;
@Service
public class CouponServiceimpl implements CouponService {
	@Autowired
	CouponRepository couponRepo;
	@Autowired
	EncounterRepository encounterRepo;
	@Autowired
	TeleMedicienRepo teleMedicineRepo;

	@Override
	public Optional<Cupon> getCoupon(String client) {

		return couponRepo.findById(client);

}

	@Override
	public Cupon addCupon(Cupon cupon) {
		// TODO Auto-generated method stub
		return couponRepo.save(cupon) ;
	}

	@Override
	public Cupon updateCupon(Cupon cupon) {
		// TODO Auto-generated method stub
		return couponRepo.save(cupon);
	}

	@Override
	public Optional<Cupon> deleteCupon(String client) {
		// TODO Auto-generated method stub
		return couponRepo.findById(client);
	}
	public String coupon(String client) {
		if (client == null || "".equals(client)) {
			throw new NullPointerException();
		} else if ("JIO".equals(client)) {
			return "JIO20";
		} else {
			return "ALL25";
		}
	}
	public WebTelemedicine loadByEncounterId(Long encounterId) {
        Encounter encounter = encounterRepo.findOneById();
        return teleMedicineRepo.findFirstByEncounter(encounter);
    }
	
}