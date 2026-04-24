package java_springboot.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getMensagem() {
        return "Camada Service do Java: OK!";
    }
}