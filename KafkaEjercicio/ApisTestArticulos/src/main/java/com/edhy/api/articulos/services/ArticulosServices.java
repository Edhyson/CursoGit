package com.edhy.api.articulos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edhy.api.articulos.model.Articulo;
import com.edhy.api.articulos.repository.ArticulosRepository;

@Service
public class ArticulosServices {

	
	@Autowired
	ArticulosRepository articulosRepository;
	
	public Articulo alta(Articulo articulo) {
		
	return	articulosRepository.save(articulo);
		
	}

	public Optional<Articulo> consulta(long idArticulo) {
		// TODO Auto-generated method stub
		
		return articulosRepository.findById(idArticulo);
	}

	public Articulo actualiza(Articulo articulo) {
		 //pruebas de git servicio actualiza 
		// TODO Auto-generated method stub
		return articulosRepository.saveAndFlush(articulo);
	}

	public void delete(long idArticulo) {
		// TODO Auto-generated method stub
		 articulosRepository.deleteById(idArticulo);
	}

	public List<Articulo> todo() {
		// TODO Auto-generated method stub
		return articulosRepository.findAll();
	}
	
	
}
