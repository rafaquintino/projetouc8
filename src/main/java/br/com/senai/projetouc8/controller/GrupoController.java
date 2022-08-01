package br.com.senai.projetouc8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GrupoController {
	
	
	
	@GetMapping({"/grupo","/"})
	public String listaGrupo(Model modelo) {
		modelo.addAttribute("grupo", servico.listaGrupo());
		return "grupo";// mostra a página grupo.html
	}

}
