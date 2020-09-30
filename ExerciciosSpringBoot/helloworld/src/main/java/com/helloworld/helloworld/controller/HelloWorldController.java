package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/helloworld")
public class HelloWorldController {
	@GetMapping("/mentalidade")
	public String mentalidade() {
		return ("Para realizar a atividade, utilizei a mentalidade de persitência, pois se trata de um assunto novo onde os conceitos ainda estou assimilando.");
	}
	@GetMapping("/aprendizagem")
	public String aprendizagem() {
		return ("Nessa semana, quero aprender claramente os conceitos de REST e todos os métodos envolvidos, e também continuar aprendendo como posso aplicá-los.");
	}
}
