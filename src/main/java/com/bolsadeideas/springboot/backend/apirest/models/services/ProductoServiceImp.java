package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IProductoDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

@Service
public class ProductoServiceImp implements IProducto {

	@Autowired
	private IProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}


}
