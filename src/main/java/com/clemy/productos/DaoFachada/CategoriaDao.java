package com.clemy.productos.DaoFachada;

import java.util.List;

import com.clemy.productos.modelo.Categorias;



public interface CategoriaDao {
 public List<Categorias> findAll();
 public Categorias findByID(int id);
 public void create(Categorias categorias);
 public void update(Categorias categorias);
 public List<Categorias> saveAll(List<Categorias> listcategorias);
}
