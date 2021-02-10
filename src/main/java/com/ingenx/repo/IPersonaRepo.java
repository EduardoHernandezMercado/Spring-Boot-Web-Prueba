package com.ingenx.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ingenx.model.Persona;



public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
