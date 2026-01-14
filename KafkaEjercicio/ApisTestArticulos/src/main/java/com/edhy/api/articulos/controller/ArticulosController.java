package com.edhy.api.articulos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edhy.api.articulos.model.Articulo;
import com.edhy.api.articulos.services.ArticulosServices;

@RestController
@RequestMapping( "/api/articulos")
public class ArticulosController {

	@Autowired
	ArticulosServices articulosService; 
	
	
	@PostMapping( "/alta")
	public ResponseEntity<Articulo> alta(@RequestBody Articulo articulo) {
				  //pruebas de git alta
				  // se agrega nuevo comentario en GIT
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(articulosService.alta(articulo)) ;
		
	}
	
	
	 @GetMapping( "/consulta/{idArticulo}")
	 public ResponseEntity<?> consulta(@PathVariable  long idArticulo){
		  //pruebas de git consulta
		 return ResponseEntity.status(HttpStatus.OK)
				 .body(articulosService.consulta(idArticulo)
						 .isEmpty()?HttpStatus.NO_CONTENT:articulosService.consulta(idArticulo).get());
	 }
	 
	 @PutMapping("/actualiza")
	 public ResponseEntity<?> actualiza(@RequestBody Articulo articulo) {
		  //pruebas de git actualiza
		 return ResponseEntity.status(HttpStatus.OK)
				 .body(articulosService.actualiza(articulo));
	 }
	 
	 
	 @DeleteMapping( "/elimina/{idArticulo}")
	 public  void elimina(@PathVariable  long idArticulo) {
		 articulosService.delete(idArticulo);
	 }
	 @GetMapping("/todo")
	 public ResponseEntity<?> todo(){
		 //pruebas de git
		return ResponseEntity.status(HttpStatus.OK)
		 .body(articulosService.todo());
		 
	 }
	 
}
