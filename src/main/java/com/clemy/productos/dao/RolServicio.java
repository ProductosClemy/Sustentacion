package com.clemy.productos.dao;
import java.util.List;

import com.clemy.productos.modelo.Rol;


public interface RolServicio {
public List<Rol> BuscarTodos();
	
	public void crearRol(Rol rol);
		
	public void actualizarRol(Rol rol);
	
}
