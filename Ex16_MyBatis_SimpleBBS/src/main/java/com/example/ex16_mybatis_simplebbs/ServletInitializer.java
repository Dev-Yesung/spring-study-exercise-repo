package com.example.ex16_mybatis_simplebbs;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Ex16MyBatisSimpleBbsApplication.class);
	}

}
