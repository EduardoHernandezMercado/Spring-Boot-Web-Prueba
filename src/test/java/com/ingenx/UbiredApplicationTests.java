package com.ingenx;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.ingenx.model.Persona;
import com.ingenx.repo.IPersonaRepo;



@RunWith(SpringRunner.class)
@SpringBootTest
class UbiredApplicationTests {

	
	@Autowired
		private IPersonaRepo repo;
		
		
		
		@Test
		public void crearUsuarioTest() {
			Persona us = new Persona();
			us.setIdPersona(4);
			us.setNombre("codex");
			//us.setClave(encoder.encode("123"));		
			Persona retorno = repo.save(us);
			
			assertTrue(retorno.getIdPersona()==(us.getIdPersona()));
		}


}
