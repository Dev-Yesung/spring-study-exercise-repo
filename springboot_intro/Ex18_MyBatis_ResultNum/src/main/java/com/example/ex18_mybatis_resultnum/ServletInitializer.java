package com.example.ex18_mybatis_resultnum;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Ex18MyBatisResultNumApplication.class);
	}

}
