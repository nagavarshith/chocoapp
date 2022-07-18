package com.chocolate.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chocolate.store.entity.Chocolate;
import com.chocolate.store.repository.Chocorepo;

@SpringBootApplication
public class ChocolatestoreApplication{

	public static void main(String[] args) {
		SpringApplication.run(ChocolatestoreApplication.class, args);
	}

//	@Autowired
//	private Chocorepo crepo;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Chocolate c1 = new Chocolate("DairyMilk",20,10);
//		crepo.save(c1);
//		
//		Chocolate c2 = new Chocolate("5star",10,10);
//		crepo.save(c2);
//		
//	}

}
