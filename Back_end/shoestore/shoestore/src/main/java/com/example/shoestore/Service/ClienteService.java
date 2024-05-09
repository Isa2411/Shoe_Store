package com.example.shoestore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoestore.Interface.ICliente;
import com.example.shoestore.InterfaceService.IClienteService;
import com.example.shoestore.model.Cliente;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private ICliente data;
	
	@Override
	public List<Cliente> Listar() {
		return (List<Cliente>)data.findAll();
	}
	
	@Override
	public List<Cliente> ListarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Cliente c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
