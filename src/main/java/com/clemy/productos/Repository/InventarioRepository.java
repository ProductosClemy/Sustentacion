package com.clemy.productos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clemy.productos.modelo.Inventario;


 @Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {

}
