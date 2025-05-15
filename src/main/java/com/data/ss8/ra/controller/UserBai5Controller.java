package com.data.ss8.ra.controller;
import com.data.ss8.ra.model.UserBai5;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserBai5Controller {
    @GetMapping("/bai5")
    public ModelAndView getUsers() {
        List<UserBai5> users = new ArrayList<>();
        users.add(new UserBai5("Q", 25, "2000", "q@example.com", "0987654321"));
        users.add(new UserBai5("A", 24, "2001", "@example.com", "0987654321"));
        users.add(new UserBai5("C", 23, "2002", "c@example.com", "0987654321"));
        ModelAndView modelAndView = new ModelAndView("userList");
        modelAndView.addObject("users", users);
        return modelAndView;
    }
}
