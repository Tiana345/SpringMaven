package com.manpower.test.jpa;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.manpower.controller.MainController;
import com.manpower.test.config.ControllerTestConfig;

//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {ControllerTestConfig.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,
classes = MainController.class)
@AutoConfigureMockMvc
public class TestMyController {

	// @InjectMocks
	// Ingredients contIngr = new Ingredients();
	@Before
	public void setUp() throws Exception {
	}

	@Autowired
	private MockMvc mvc;


	@Test
	public void myMVCTest() throws Exception {
		mvc.perform(get("/")).andExpect(status().isOk());
	}
	
	@Test
	public void testMVCHome() throws Exception {
		mvc.perform(get("/home")).andExpect(status().isOk());
	}
	
	@Test
	public void testMVCAdd()throws Exception{
		mvc.perform(get("/lol")).andExpect(status().isNotFound());
	}

	@Test
	public void testMVCAdd1()throws Exception{
		mvc.perform(get("/add")).andExpect(status().isOk());
	}
}
