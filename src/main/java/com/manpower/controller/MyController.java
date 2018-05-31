package com.manpower.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manpower.clientTest.ClientTest;
import com.manpower.clientTest.jsonApiClass;
import com.manpower.entity.Ingredients;
import com.manpower.service.ServiceIngredient;


@Controller
public class MyController {
	
	@Autowired
	ServiceIngredient serv;

		@RequestMapping(value="/")
		public String helloJSP(Model model) {
			System.out.println("lol");
			return "home";
		}
		
		@RequestMapping(value="/home",  method = RequestMethod.GET)
		public  String homePage() {
			
			return "home";
		}
		
		@RequestMapping(value="/recette",  method = RequestMethod.GET)
		public  String recettePage(Map<String, Object> model) {
		//	ServiceIngredient serv = new ServiceIngredient();
			List<Ingredients> maListe = serv.findMyIngredient(); 
			model.put("maListe",maListe);
			
			
			System.out.println(maListe);
			
//			for(Ingredients ing: maListe) {
//				
//			
//			model.put("id", ing.getId());
//			model.put("nom", ing.getNom());
//			model.put("title", ing.getQuantity());
			
			
			//}
			return "addAnIngredient";
		}
		
	
		
		@RequestMapping(value="/header")
		public String header() {
			
			return "Header";
		}
		
		
//		@GetMapping("/add")
//	    public String showForm(Ingredients ingre) {
//	        return "add";
//	    }
		   
		

		@RequestMapping(value = "/add",  method = RequestMethod.GET)
		public String clientSide(Map<String, Object> model) {
	
			ClientTest client= new ClientTest();

			jsonApiClass jac =client.retrive(); 
			System.out.println(jac);
			model.put("userId", jac.getUserId());
			model.put("id", jac.getId());
			model.put("title", jac.getTitle());
			model.put("body", jac.getBody());
			
			return "add";
			}

}

