package tech.topskills.bankaccount.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(@RequestParam(required = false,
                           defaultValue = "World") String name, Model model){
        model.addAttribute("user", name);
        return "hello";
    }
}
