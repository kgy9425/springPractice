package com.example.springPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model)
    {
        model.addAttribute("username", "Kim");
        return "greetings"; //templates/greeting.mustache -> 브라우저로 전송
    }

    @GetMapping("/bye")
    public String Bye(Model model)
    {
        model.addAttribute("nickname", "Kim");
        return "goodbye";
    }
}
