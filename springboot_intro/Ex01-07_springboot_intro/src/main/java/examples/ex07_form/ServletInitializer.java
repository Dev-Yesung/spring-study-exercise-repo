package examples.ex07_form;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import ysng_ysng.springboot_intro.SpringbootIntroApplication;

public class ServletInitializer extends SpringBootServletInitializer {
	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Ex07FormApplication.class);
	}
}
