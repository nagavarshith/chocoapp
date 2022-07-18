package com.chocolate.store.service;

import java.util.List;

import com.chocolate.store.entity.Chocolate;

public interface Chocoservice{
	
	List<Chocolate> getAllChocos();
	
	Chocolate saveChocolate(Chocolate chocolate);
	
	Chocolate updateChocolate(Chocolate chocolate);
	
	Chocolate getChocolateById(int id);
	
	void deleteChocolate(int id);
	
	

}  
