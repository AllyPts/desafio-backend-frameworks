package java_springboot.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
    @GetMapping("/test")
    public String test() {
        return "Java Spring Boot rodando localmente com sucesso!";
    }
}