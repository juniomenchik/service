package com.ecommerce.service.api.controller.caixa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/caixa")
public class CaixaController {


    @GetMapping("/comandas")
    public String listarComandas(Model model) {
        // model.addAttribute("comandas", comandaRepository.findAll());

        return "caixa/comandas";
    }

    @PostMapping("/remover-item/{id}")
    public String removerItem(@PathVariable Long id) {
        // Lógica para remover item da comanda
        
        return "redirect:/caixa/comandas";
    }
}