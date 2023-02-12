package com.example.footballscoreboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScoreBoardController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to the Football Score Board Demo");
        return "scoreBoardMain";
    }
}