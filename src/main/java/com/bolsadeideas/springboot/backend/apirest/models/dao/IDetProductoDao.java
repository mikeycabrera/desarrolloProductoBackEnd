package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.detalleProducto;

public interface IDetProductoDao extends CrudRepository<detalleProducto, Long> {

}
