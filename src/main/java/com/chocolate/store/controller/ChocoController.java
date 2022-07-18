package com.chocolate.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.chocolate.store.entity.Chocolate;
import com.chocolate.store.service.Chocoservice;

@Controller
public class ChocoController {

	@Autowired
	private Chocoservice cservice;

	@GetMapping("/chocos")
	public String getAllChocos(Model model) {
		model.addAttribute("Chocolates", this.cservice.getAllChocos());
		return "chocos";
	}

	@GetMapping("/chocos/{new}")
	public String createChocoForm(Model model) {

		// create a chocolate obj to hold data
		Chocolate c = new Chocolate();

		// ("key",value)
		model.addAttribute("chocolate", c);
		return "create_chocolate";

	}

	@PostMapping("/chocos")
	public String saveChocolate(@ModelAttribute("Chocolate") Chocolate c) {

		cservice.saveChocolate(c);

		return "redirect:/chocos";

	}

	@GetMapping("chocos/edit/{id}")
	public String editStudentForm(@PathVariable int id,Model model){
		
		model.addAttribute("chocolate",cservice.getChocolateById(id));
		
		return "edit_chocolate";
	}

	@PostMapping("/chocolates/{id}")
	public String updateChocolate(@PathVariable int id, @ModelAttribute("chocolate") Chocolate chocolate, Model model)
	{
		
		Chocolate c = cservice.getChocolateById(id);
		c.setCid(id);
		c.setCname(chocolate.getCname());
		c.setCavailable(chocolate.getCavailable());
		c.setCprice(chocolate.getCprice());
		
		cservice.saveChocolate(c);
		
		return "redirect:/chocos";	
	}
	
	@GetMapping("/chocolates/{id}")
	public String deleteChocolate(@PathVariable int id){
		cservice.deleteChocolate(id);
		
		return "redirect:/chocos";
		
	}
	
	
	

}
