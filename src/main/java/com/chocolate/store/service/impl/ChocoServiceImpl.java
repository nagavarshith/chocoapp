package com.chocolate.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chocolate.store.entity.Chocolate;
import com.chocolate.store.repository.Chocorepo;
import com.chocolate.store.service.Chocoservice;

@Service
public class ChocoServiceImpl implements Chocoservice{
	
	@Autowired
	private Chocorepo crepo;
	
	@Override
	public List<Chocolate> getAllChocos() {
		
		return this.crepo.findAll();
	}

	@Override
	public Chocolate saveChocolate(Chocolate chocolate) {
		
		return crepo.save(chocolate);
	}

	@Override
	public Chocolate getChocolateById(int id) {
		// TODO Auto-generated method stub
		return crepo.findById(id).get();
	}
	
	@Override
	public Chocolate updateChocolate(Chocolate chocolate) {		
		return crepo.save(chocolate);
	}

	@Override
	public void deleteChocolate(int id) {
		// TODO Auto-generated method stub
		
		crepo.deleteById(id);
		
	}
	
}
