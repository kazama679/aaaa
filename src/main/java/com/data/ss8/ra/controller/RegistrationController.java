package com.data.ss8.ra.controller;

import com.data.ss8.ra.model.User;
import com.data.ss8.ra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping("addUser")
    public String add() {
        return "bai4";
    }

    @PostMapping("saveUser")
    public String save(@RequestParam String name,
                       @RequestParam String email,
                       @RequestParam String phone,
                       Model model) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPhone(phone);
        boolean result = userService.add(user);
        if (result) {
            model.addAttribute("user", user);
            return "bai4Result";
        }else{
            return "error";
        }
    }
}
