/**
 * 
 */
package com.edhy.api.articulos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edhy.api.articulos.model.Articulo;

/**
 * @author kizho
 *
 */
public interface ArticulosRepository extends JpaRepository<Articulo, Long>{

}
