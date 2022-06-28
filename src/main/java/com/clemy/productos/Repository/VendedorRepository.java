package com.clemy.productos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clemy.productos.modelo.Vendedor;




@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Integer>{

}
