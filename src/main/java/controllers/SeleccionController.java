package controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import repositories.SeleccionRepository;
import service.SeleccionService;

@RestController
@RequestMapping("/seleccion")
public class SeleccionController<seleccionService> {
	
	@Autowired
	SeleccionService seleccionService;
	
	@GetMapping("/{seleccion}")
	public seleccionService getSeleccionyId(@PathVariable Integer id) {
		
		Optional<seleccionService> seleccion = SeleccionRepository.findById(id);
		
		if (seleccionService.isPresent()) {
			return seleccionService.get();
		}
		
		return null;

	}
	
	@PostMapping
	public seleccionService postProductos(@RequestBody seleccionService seleccion) {
		
		SeleccionService.save(seleccion);
		
		return seleccionService;
		

	}
}
