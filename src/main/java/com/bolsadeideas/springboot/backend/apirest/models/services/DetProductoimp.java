package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IDetProductoDao;
import com.bolsadeideas.springboot.backend.apirest.models.dao.IProductoDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;
import com.bolsadeideas.springboot.backend.apirest.models.entity.detalleProducto;

@Service
public class DetProductoimp implements IdetalleProducto {

	 @Autowired
	 private IDetProductoDao detalleProductoDao;
	
	 @Override
	@Transactional(readOnly = true)
	public List<detalleProducto> findAll() {
	     return (List<detalleProducto>) detalleProductoDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public detalleProducto findById(Long id) {
		return detalleProductoDao.findById(id).orElse(null);
	}

}

