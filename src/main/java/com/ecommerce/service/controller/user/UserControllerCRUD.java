package com.ecommerce.service.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.util.ResponseBodyDTO;

@RestController
@RequestMapping("/user")
public class UserControllerCRUD {
    

    @GetMapping
    public ResponseBodyDTO getUsers(){
    
        var response = new ResponseBodyDTO("OK", "No Problem");

        return response;
    }
}
