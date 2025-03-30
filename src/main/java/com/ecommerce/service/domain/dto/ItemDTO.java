package com.ecommerce.service.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private Long id;

    private String codigoDeBarra;                       
    private String name;
    private String fullName;
    private Double preco;                               
    private String categoria;          
    private String descricao;

}
