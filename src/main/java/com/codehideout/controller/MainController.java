package com.codehideout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("siteName","Code Hideout");
        model.addAttribute("message","개발자 커뮤니티 사이트 입니다.");

        return "index";
    }
}
