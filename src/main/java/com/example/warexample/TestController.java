package com.example.warexample;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class TestController {
 
    @GetMapping("/hello") 
    public String message()
    {
        return "Hello JENKINS CI/CD - ESSID from Controller!.";
    }
}