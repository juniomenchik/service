package com.ecommerce.service.api.controller.login;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // ← Mudança crucial aqui
public class LoginController {

    // Página de login personalizada
    @GetMapping("/login")
    public String showLoginPage() {
        return "index"; 
    }

    // Página inicial após login (redireciona conforme perfil)
    @GetMapping("/")
    public String home(Authentication authentication) {
        if (authentication.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_CAIXA"))) {
            return "redirect:/caixa/comandas";
        } else {
            return "redirect:/garcom/lancar";
        }
    }

    @GetMapping("/user-info")
    public String getUserInfo(Authentication authentication) {
        String username = authentication.getName(); // Pega o nome do usuário logado
        System.out.println("Usuário logado: " + username);
        return "user-info";
    }
}