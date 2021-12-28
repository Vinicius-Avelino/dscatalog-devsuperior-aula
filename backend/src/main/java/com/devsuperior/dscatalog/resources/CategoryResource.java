package com.devsuperior.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	// Implementa o controladores REST

	// A API será implementada pelos controladores
	// Annotation é uma forma enxuta e simples de configurar algo no código, forma
	// de utilizar
	// algo que ja está implementado. Efetua um pré processamento por baixo dos
	// panos na compilação

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Books"));
		list.add(new Category(2L, "Eletronics"));
		return ResponseEntity.ok().body(list);

	}
}
