package com.example.springsecuritydemocourses.demo.controller;


import com.example.springsecuritydemocourses.demo.jwt.UsernameAndPasswordAuthenticationRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yaml.snakeyaml.error.MarkedYAMLException;

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("register")
    public void register(@RequestBody UsernameAndPasswordAuthenticationRequest user) {
        // add to list
    }
}
