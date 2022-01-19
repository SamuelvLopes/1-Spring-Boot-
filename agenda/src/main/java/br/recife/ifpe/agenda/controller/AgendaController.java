package br.recife.ifpe.agenda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.recife.ifpe.agenda.model.User;

@RestController
@RequestMapping("/")

public class AgendaController{
	
	
	
	@GetMapping
	public User user() {
		User user =new User();
		user.setId(1);
		user.setNome("Dani");
		user.setUsername("danileao");
		return user;
		
		
	}
	
}