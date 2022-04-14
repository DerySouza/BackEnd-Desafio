package br.com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.banco.model.UserCont;
import br.com.banco.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired 
	private UserRepository userRepository;
	
	@GetMapping("users")
	public List<UserCont>getUserCont(){
		return this.userRepository.findAll();
	} 
 
	 
}
