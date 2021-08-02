package com.example.springboot_exercise_401;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage(){
        return "index";
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/student")
    public String student(){
        return "student";
    }

    @RequestMapping("/teacher")
    public String teacher(){
        return "teacher";
    }

    @RequestMapping("/course")
    public String course(){
        return "course";
    }

}