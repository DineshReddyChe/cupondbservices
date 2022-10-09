package com.example.cupon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cupon.model.Encounter;
import com.example.cupon.model.WebTelemedicine;

public interface TeleMedicienRepo extends JpaRepository<WebTelemedicine, Long>{
	public WebTelemedicine findFirstByEncounter(Encounter encounter);


}
