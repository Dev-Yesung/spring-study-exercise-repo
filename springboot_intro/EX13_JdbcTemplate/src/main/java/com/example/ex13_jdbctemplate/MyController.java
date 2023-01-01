package com.example.ex13_jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller public class MyController {
	@Autowired private MyUserDAO userDAO;

	@RequestMapping("/") public @ResponseBody String root() throws Exception {
		return "JdbcTemplate 사용하기";
	}

	@GetMapping("/user") public String userListPage(Model model) {
		model.addAttribute("users", userDAO.list());
		return "userlist";
	}
}
