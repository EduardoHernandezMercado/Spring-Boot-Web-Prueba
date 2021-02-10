package com.ingenx.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ingenx.model.Persona;
import com.ingenx.repo.IPersonaRepo;

@Controller
public class DController {

	
		@Autowired(required=true)
		public IPersonaRepo repo;
		
		@GetMapping("/g")
		public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			
		
			Persona p =new Persona();
			p.setIdPersona(1);
			p.setNombre("Eduardo");
			repo.save(p);
			
			model.addAttribute("name", name);
			return "g";
		}
}
