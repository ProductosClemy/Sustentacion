package com.clemy.productos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clemy.productos.modelo.Ventas;


@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer> {

}
