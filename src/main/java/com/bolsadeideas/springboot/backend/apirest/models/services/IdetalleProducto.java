package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.detalleProducto;

public interface IdetalleProducto {

	public List<detalleProducto> findAll();
	
	public detalleProducto findById(Long id);
}
