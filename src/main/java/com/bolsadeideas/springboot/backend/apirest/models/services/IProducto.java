package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

public interface IProducto {
	
	public List<Producto> findAll();

}
