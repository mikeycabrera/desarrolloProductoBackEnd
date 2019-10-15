package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;
import com.bolsadeideas.springboot.backend.apirest.models.services.IProducto;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ProductoRestController {
	
	@Autowired
	private IProducto productoService;
	
	@GetMapping("/productos")
	public List<Producto> index() {
		return productoService.findAll();
	}
	}


