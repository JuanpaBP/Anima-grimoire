package anima.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import anima.project.domain.Factura;

@Controller//REST CONTROLLER DEVUELVE LO QUE DIGA PUNTUALMENTE EL MÉTODO, CONTROLLER SIEMPRE DEVUELVE VISTAS
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	private Factura factura;
	
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("factura", factura);
		model.addAttribute("titulo", "Ejemplo Factura con Inyección de Dependencias");
		return "factura/ver";
	}
	
	@RequestMapping(value = "/ping", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String ping()
	{
		return "pong";
	}
}
