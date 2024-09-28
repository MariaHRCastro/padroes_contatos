package com.lab.padroes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.padroes.entidades.Contato;
import com.lab.padroes.repositorios.ContatoRepositorio;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

	@Autowired
	private ContatoRepositorio contatoRepositorio;
	
	@GetMapping
	public List<Contato> obterContatos(){
		return contatoRepositorio.findAll();
	}
	
    @PostMapping
    public void criarContato(@RequestBody Contato contato) {
        contatoRepositorio.save(contato);
    }
	
	
}
