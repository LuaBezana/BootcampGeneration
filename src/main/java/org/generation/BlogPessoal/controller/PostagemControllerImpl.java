package org.generation.BlogPessoal.controller;

import java.util.List;

import org.generation.BlogPessoal.model.Postagem;
import org.generation.BlogPessoal.repository.PostagemRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemControllerImpl {

	@Autowired
	private PostagemRepositoryCustom repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}
