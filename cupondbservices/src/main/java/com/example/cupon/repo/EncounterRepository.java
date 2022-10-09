package com.example.cupon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cupon.model.Encounter;

public interface EncounterRepository extends JpaRepository<Encounter, Long>{




	public Encounter findOneById();

}
