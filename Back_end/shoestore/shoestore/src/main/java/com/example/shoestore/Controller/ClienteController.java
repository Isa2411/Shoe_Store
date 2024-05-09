package com.example.shoestore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.shoestore.InterfaceService.IClienteService;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping
public class ClienteController {

	private IClienteService service;
	
	@GetMapping("/Listar")
	public String listar(Model model) {
		List<Cliente>clientes=service.listar();
		model.addAtribute("clientes", clientes);
		return "paginaweb";
	}
}
