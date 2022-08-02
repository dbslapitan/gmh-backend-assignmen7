package com.example.Users;

import com.example.Users.Service.HomeService;
import com.example.Users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    public HomeService homeService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/")
    public String indexPost(@ModelAttribute User user){
        homeService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users")
    public String users(Model model){
        model.addAttribute("users", homeService.getUsers());
        return "users";
    }
}
