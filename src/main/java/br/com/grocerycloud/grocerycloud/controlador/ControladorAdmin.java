package br.com.grocerycloud.grocerycloud.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/admin")
public class ControladorAdmin {
    
    @GetMapping("/")
    public String homeAdmin() {
        return "admin/menuAdmin";
    }
    
}
