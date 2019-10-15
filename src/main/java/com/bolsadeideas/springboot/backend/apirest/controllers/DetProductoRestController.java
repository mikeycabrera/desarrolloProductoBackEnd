package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;
import com.bolsadeideas.springboot.backend.apirest.models.entity.detalleProducto;
import com.bolsadeideas.springboot.backend.apirest.models.services.IProducto;
import com.bolsadeideas.springboot.backend.apirest.models.services.IdetalleProducto;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")

public class DetProductoRestController {
	
	@Autowired
	IdetalleProducto servicioDetalleProducto;
	
	@GetMapping("/detalleProducto")
	public List<detalleProducto> index() {
		return servicioDetalleProducto.findAll();
	}
	
	@GetMapping("/productos/detalleProducto/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {
		
		detalleProducto detalleProducto = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			detalleProducto = servicioDetalleProducto.findById(id);
		} catch(DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(detalleProducto == null) {
			response.put("mensaje", "El cliente ID: ".concat(id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<detalleProducto>(detalleProducto, HttpStatus.OK);
	}
}
