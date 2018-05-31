package com.manpower.clientTest;

import org.springframework.web.client.RestTemplate;

public class ClientTest {
	
	
	public ClientIngredients retriveObj() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url =  "http://localhost:8081/ws/service/ingredients";
		ClientIngredients cl = restTemplate.getForObject(url + "/1", ClientIngredients.class);
		
		return cl;
	}
	
	
	public jsonApiClass retrive() {
		RestTemplate restTemplate = new RestTemplate();
		String url ="https://jsonplaceholder.typicode.com/posts";
		jsonApiClass jac = restTemplate.getForObject(url + "/1", jsonApiClass.class);
		
		return jac;
		
	}
	
	
	
	

}
