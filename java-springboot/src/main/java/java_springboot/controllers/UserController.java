package java_springboot.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
    @GetMapping("/test")
    public String test() {
        return "Conexão com a camada Controller do Java Spring Boot funcionando!";
    }
}