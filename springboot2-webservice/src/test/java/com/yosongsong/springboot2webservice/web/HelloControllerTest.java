package com.yosongsong.springboot2webservice.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class HelloControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	public void hello() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello");
		String hello = "hello";
		mvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string((hello)));
	}

	@Test
	public void helloDto() throws Exception {
		String name = "hello";
		int amount = 1000;

		mvc.perform(get("/hello/dto").param("name", name).param("amount", String.valueOf(amount)))
			.andExpect(status().isOk()).andExpect(jsonPath("$.name", is(name)))
			.andExpect(jsonPath("$.amount", is(amount)));
	}
}
