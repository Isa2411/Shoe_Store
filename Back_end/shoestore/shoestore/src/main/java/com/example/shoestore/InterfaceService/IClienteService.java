package com.example.shoestore.InterfaceService;

import java.util.List;

import org.apache.el.stream.Optional;

import com.example.shoestore.model.Cliente;

public interface IClienteService {
	public List<Cliente>Listar();
	public Optional<Cliente>ListarId(int id);
	public int save(Cliente c);
	public void delete(int id);
	List<Cliente> ListarId(int id);
}
