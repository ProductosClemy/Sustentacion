package com.clemy.productos.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clemy.productos.Repository.RolRepository;
import com.clemy.productos.dao.RolServicio;
import com.clemy.productos.modelo.Rol;

@Service
public class RolImp implements RolServicio {
	@Autowired
	private RolRepository rolRepositorio;

	@Override
	public List<Rol> BuscarTodos() {

		return rolRepositorio.findAll();
	}

	@Override
	public void crearRol(Rol rol) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarRol(Rol rol) {
		// TODO Auto-generated method stub

	}

}
