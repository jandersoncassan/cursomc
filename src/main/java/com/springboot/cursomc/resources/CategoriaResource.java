package com.springboot.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cursomc.domain.Categoria;
import com.springboot.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping(value="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> find(@PathVariable("id") Integer id) {		
		
		Categoria categoria = categoriaService.buscar(id);		
		return ResponseEntity.ok(categoria);
		
	}
}
