package com.generation.sustech.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.sustech.model.Usuario;
import com.generation.sustech.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {


	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/all")
	public ResponseEntity <List<Usuario>> getAll(){
		return ResponseEntity.ok(usuarioRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable Long id){
		return usuarioRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	
}
