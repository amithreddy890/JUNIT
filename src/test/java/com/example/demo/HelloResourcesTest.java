package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloResourcesTest {
	private MockMvc mockmvc;
	@InjectMocks
	private HelloResource helloResource;
	@Before
	public void setUp() throws Exception {
		// TODO Auto-generated method stub
		mockmvc=MockMvcBuilders.standaloneSetup(helloResource)
				.build();

	}
	 @Test
	    public void testHelloWorld() throws Exception {

	       

	        mockmvc.perform(get("/hello"))
	                .andExpect(status().isOk())
	                .andExpect(content().string("hello world"));
	 }
}
