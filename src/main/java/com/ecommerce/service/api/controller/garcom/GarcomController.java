package com.ecommerce.service.api.controller.garcom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.service.persistence.jpa.entity.Comanda;

@Controller
@RequestMapping("/garcom")
public class GarcomController {

    @GetMapping("/lancar")
    public String telaLancamento(Model model) {
        // Add empty comanda object for the form
        // model.addAttribute("comanda", ComandaDAODummy.getComandaDAO());
        
        // Add list of available items for the dropdown
        // model.addAttribute("itens", ComandaDAODummy.findAllItems());
        
        return "garcom/lancar";
    }

    @PostMapping("/lancar-item")
    public String lancarItem(@ModelAttribute Comanda comanda) {
        // comandaRepository.save(comanda);

        return "redirect:/garcom/lancar";
    }
    
}
