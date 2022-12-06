package examples.ex05_jsp_use_application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller public class MyController {
	@RequestMapping("/") @ResponseBody public String root() throws Exception {
		return "JSP in Gradle";
	}

	@RequestMapping("/test1") public String test1() {
		return "test1";
	}

	@RequestMapping("/test2") public String test2() {
		return "sub/test2";
	}
}
