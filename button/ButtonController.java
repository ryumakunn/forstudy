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
        String message;
        switch (button) {
            case "Button 1":
                message = "You clicked Button 1";
                // Button 1をクリックしたときの処理
                break;
            case "Button 2":
                message = "You clicked Button 2";
                // Button 2をクリックしたときの処理
                break;
            case "Button 3":
                message = "You clicked Button 3";
                // Button 3をクリックしたときの処理
                break;
            default:
                message = "Unknown button";
                // 未知のボタンをクリックしたときの処理
                break;
            }
        model.addAttribute("message", message);
        return "index";
    }

}
