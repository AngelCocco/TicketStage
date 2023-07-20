package com.ticketstage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ticketstage.entities.Spettacolo;
import com.ticketstage.repos.SpettacoloDAO;

public class SpettacoloServiceIMPL implements SpettacoloService{

	
	@Autowired
	private SpettacoloDAO dao;
	
	
	@Override
	public List<Spettacolo> getSpettacolo() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}


}
