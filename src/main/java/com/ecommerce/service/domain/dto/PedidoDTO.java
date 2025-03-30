package com.ecommerce.service.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    private Long id;

    private ComandaDTO comanda; 
    private String observacao; 
    private ItemDTO item; 
    private Integer quantidade; 

}
