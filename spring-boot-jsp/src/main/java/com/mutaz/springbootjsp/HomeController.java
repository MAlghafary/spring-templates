package com.mutaz.springbootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        String message = "This is a model attribute";
        model.addAttribute("msg",message);
        return "home";
    }
}
