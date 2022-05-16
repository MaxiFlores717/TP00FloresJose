package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;


@Controller
public class CalculadoraController {
	
	@GetMapping("/menu")
	public String mostrarMenuCalculadora(){
		
		return "menu";
	}
	@GetMapping("/calculosuma")
	public String getSuma(@RequestParam(name="n1")double n1, @RequestParam(name="n2")double n2,Model model) {
		double resultadoSuma;
		Calculadora menuCalculadora = new Calculadora();
		menuCalculadora.setN1(n1);
		menuCalculadora.setN2(n2);
		resultadoSuma = menuCalculadora.Suma();
		model.addAttribute("resultadoSuma", resultadoSuma);
		return "ResultadoSuma";
	}
	@GetMapping("/calculoresta")
	public String getResta(@RequestParam(name="n1")double n1, @RequestParam(name="n2")double n2,Model model) {
		double resultadoResta;
		Calculadora menuCalculadora = new Calculadora();
		menuCalculadora.setN1(n1);
		menuCalculadora.setN2(n2);
		resultadoResta = menuCalculadora.Resta();
		model.addAttribute("resultadoResta", resultadoResta);
		return "ResultadoResta";
	}
	@GetMapping("/calculodivision")
	public String getDivision(@RequestParam(name="n1")double n1, @RequestParam(name="n2")double n2,Model model) {
		double resultadoDivision;
		Calculadora menuCalculadora = new Calculadora();
		menuCalculadora.setN1(n1);
		menuCalculadora.setN2(n2);
		resultadoDivision = menuCalculadora.Division();
		model.addAttribute("resultadoDivision", resultadoDivision);
		return "ResultadoDivision";
	}
	@GetMapping("/calculomultiplicacion")
	public String getMultiplicacion(@RequestParam(name="n1")double n1, @RequestParam(name="n2")double n2,Model model) {
		double resultadoMultiplicacion;
		Calculadora menuCalculadora = new Calculadora();
		menuCalculadora.setN1(n1);
		menuCalculadora.setN2(n2);
		resultadoMultiplicacion = menuCalculadora.Multiplicacion();
		model.addAttribute("resultadoMultiplicacion", resultadoMultiplicacion);
		return "ResultadoMultiplicacion";
	}
	@GetMapping("/calculopotencia")
	public String getPotencia(@RequestParam(name="n1")double n1, @RequestParam(name="n2")double n2,Model model) {
		double resultadoPotencia;
		Calculadora menuCalculadora = new Calculadora();
		menuCalculadora.setN1(n1);
		menuCalculadora.setN2(n2);
		resultadoPotencia = menuCalculadora.Potencia();
		model.addAttribute("resultadoPotencia", resultadoPotencia);
		return "ResultadoPotencia";
	}
	@GetMapping("/calculoraiz")
	public String getRaiz(@RequestParam(name="n1")double n1, @RequestParam(name="n2")double n2,Model model) {
		double resultadoRaiz;
		Calculadora menuCalculadora = new Calculadora();
		menuCalculadora.setN1(n1);
		menuCalculadora.setN2(n2);
		resultadoRaiz = menuCalculadora.Raiz();
		model.addAttribute("resultadoRaiz", resultadoRaiz);
		return "ResultadoRaiz";
	}
}
