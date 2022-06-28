package com.clemy.productos.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.clemy.productos.DaoImplement.CategoriasImp;
import com.clemy.productos.DaoImplement.UploadFileImplement;
import com.clemy.productos.Repository.CategoriasRepository;
import com.clemy.productos.modelo.Categorias;




@Controller
public class UploadFileController {
@Autowired
UploadFileImplement uploadfileimplements;
@Autowired
CategoriasImp categorias;
@Autowired
CategoriasRepository categoriaRepository;

@RequestMapping("/UploadFileCategorias")
public String saveFileExcelCategorias(MultipartFile file,Model model)throws IOException{
	this.uploadfileimplements.guardarFileCategorias(file);
	List<Categorias> listarCategorias = categoriaRepository.findAll();
	model.addAttribute("listarCategorias", listarCategorias);	
	
	return"ListCategorias";
	}

}