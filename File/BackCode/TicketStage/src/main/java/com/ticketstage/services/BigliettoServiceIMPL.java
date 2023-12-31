package com.ticketstage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketstage.entities.Biglietto;
import com.ticketstage.repos.BigliettoDAO;
import com.ticketstage.repos.ClienteDAO;

@Service
public class BigliettoServiceIMPL implements BigliettoService{
	
	@Autowired
	private BigliettoDAO dao;
	
	@Override
	public List<Biglietto> getBiglietto() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
    public List<Biglietto> getBigliettoByCod_cliente(int cod_cliente) {
        return dao.getBigliettoByCodCliente(cod_cliente);
    }

	@Override
	public Biglietto addBiglietto(Biglietto b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}
	
	

}
