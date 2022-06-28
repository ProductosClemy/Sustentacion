package com.clemy.productos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clemy.productos.modelo.Cliente;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
