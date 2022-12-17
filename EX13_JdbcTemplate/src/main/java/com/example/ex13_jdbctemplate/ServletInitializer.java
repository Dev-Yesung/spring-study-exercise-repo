package com.example.ex13_jdbctemplate;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Ex13JdbcTemplateApplication.class);
	}

}
