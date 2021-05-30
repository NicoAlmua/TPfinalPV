package ar.edu.unju.edm.controller;




import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Turista;
import ar.edu.unju.edm.service.ITuristaService;

@Controller
public class TuristaController{
	
@Autowired
@Qualifier("implementacionmysql")	
ITuristaService TuristaService;
	
	@GetMapping("/turista/registrar")
	public String cargarTurista(Model model) {
		
		return("turista");
	} 
	@PostMapping("/turista/guardar")
	public String guardarNuevoturista(@Valid @ModelAttribute("unTurista") Turista nuevoTurista, BindingResult result, Model model) {		
	
			return "redirect:/turista/mostrar";
				
			
	}
	

	
	
}
