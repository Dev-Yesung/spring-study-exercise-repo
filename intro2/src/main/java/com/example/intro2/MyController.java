package com.example.intro2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller public class MyController {
	@RequestMapping("/") @ResponseBody public String root() throws Exception {
		return "Lombok 사용하기";
	}

	@RequestMapping("/test3") public String test3(Member member, Model model) {
		return "test3";
	}
}
