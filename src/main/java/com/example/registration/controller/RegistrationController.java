package com.example.registration.controller;

import com.example.registration.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @GetMapping("/register")
    public String showForm(Model model){
        model.addAttribute("student", new Student());
        return "register";
    }


    @PostMapping("/register")
    public String submitForm(@ModelAttribute Student student, Model model){
        model.addAttribute("student", student);
        return "confirmation";
    }
}



