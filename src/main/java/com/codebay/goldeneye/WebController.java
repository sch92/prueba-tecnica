package com.codebay.goldeneye;


import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {  
    @GetMapping("/")
    public String index() {
        return "redirect:/email";
    }

    @GetMapping("/email")
    public String formGet() {
        return "email";
    }

    @PostMapping("/email")
    public String formPost(User user, Model model) {
        model.addAttribute("user", user);
        return "email";
    }
}