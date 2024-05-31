package com.example.buttondemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ButtonController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/buttonClicked")
    public String buttonClicked(@RequestParam String button, Model model) {
        model.addAttribute("button", button);
        return "index";
    }
}
