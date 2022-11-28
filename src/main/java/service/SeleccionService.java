package service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.SeleccionRepository;

@Service
public class SeleccionService<Seleccion> {

	@Autowired
	SeleccionRepository seleccionRepository;
	
	public ArrayList<Seleccion> obtenerSeleccion(){
		return (ArrayList<Seleccion>) seleccionRepository.findAll();
	}
	
	public Seleccion guardarSeleccion(Seleccion seleccion) {
	
	return (Seleccion) seleccionRepository.save(seleccion);
	
	
}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
