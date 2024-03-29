package com.example.ex19_sqlLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private IMyUserDao userDao;

    @RequestMapping("/")
    public @ResponseBody String root() throws Exception {
        return "MyBatis 사용하기";
    }

    @GetMapping("/user")
    public String userlistPage(Model model) {
        model.addAttribute("users", userDao.list());
        return "userlist";
    }
}
