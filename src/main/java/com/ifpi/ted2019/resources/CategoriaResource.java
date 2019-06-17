package com.ifpi.ted2019.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifpi.ted2019.domain.Categorias;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
		public List <Categorias> listar(){
		List <Categorias> categorias= new ArrayList<Categorias>();
		categorias.add(new Categorias(1, "Informática"));
		categorias.add(new Categorias(2, "Escritório"));
		return categorias;
	}

}
